## **Maximum Subarray Problem Using Prefix Array**

### **Problem Statement**

Given an array \( A \) of \( n \) integers (both positive and negative), find a contiguous subarray that has the **maximum sum**.

### **Approach Using Prefix Sum Array**

A **prefix sum array** helps in efficiently computing the sum of any subarray. The **prefix sum** at index \( i \) is defined as:

\[
\text{prefix}[i] = A[0] + A[1] + ... + A[i]
\]

Thus, the sum of any subarray \( A[l] \) to \( A[r] \) can be computed as:

\[
\text{sum}(A[l \dots r]) = \text{prefix}[r] - \text{prefix}[l-1] \quad \text{(if \( l > 0 \), otherwise prefix[r])}
\]

Using this, we can efficiently find the **maximum subarray sum**.

### **Algorithm**

1. Compute the **prefix sum array**.
2. Initialize **minPrefix** (to store the minimum prefix sum encountered so far).
3. Iterate through the prefix sum array and update the **maximum subarray sum**.

### **Implementation**

Here’s a Java implementation of the **maximum subarray problem using the prefix sum technique**:

```java
public class MaxSubarrayPrefixSum {
    public static int maxSubarraySum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];

        // Step 1: Compute the prefix sum array
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Step 2: Find max subarray sum using prefix sum
        int maxSum = Integer.MIN_VALUE;
        int minPrefix = 0; // This will store the minimum prefix sum encountered

        for (int i = 0; i < n; i++) {
            maxSum = Math.max(maxSum, prefix[i] - minPrefix);
            minPrefix = Math.min(minPrefix, prefix[i]); // Update min prefix sum
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubarraySum(arr)); 
        // Output: 6 (Subarray: [4, -1, 2, 1])
    }
}
```

### **Explanation**

1. **Compute prefix sums**:
   - Example: Given `arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]`
   - Prefix Sum Array: `[-2, -1, -4, 0, -1, 1, 2, -3, 1]`
2. **Iterate through the prefix sum**:
   - Track `minPrefix` (smallest prefix sum encountered).
   - Compute `maxSum = prefix[i] - minPrefix` at each step.
   - Update `minPrefix` for future iterations.

### **Time Complexity Analysis**

- Computing the prefix sum array: **O(n)**
- Finding the maximum subarray sum using prefix array: **O(n)**
- **Total Complexity: O(n)** (which is optimal)

### **Comparison with Kadane’s Algorithm**

- **Prefix Sum Approach**: Works in **O(n)** but requires **extra space** for the prefix sum array.
- **Kadane’s Algorithm**: Also runs in **O(n)** but uses constant **O(1) space**, making it more efficient.


## ### **Prefix Sum Approach for Maximum Subarray Sum - In-Depth Explanation**  

The **prefix sum technique** helps compute the sum of any subarray efficiently in **O(1)** time after an **O(n)** preprocessing step. However, it requires **O(n) extra space** to store the prefix sums. Let’s explore why this happens and how the approach works in detail.

---

## **Understanding Prefix Sum**

A **prefix sum array** stores the cumulative sum of elements from the beginning of the array up to the current index. Given an array \( A \) of size \( n \), we define:

\[
\text{prefix}[i] = A[0] + A[1] + \dots + A[i]
\]

For example, consider:
\[
A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
\]

The **prefix sum array** would be:

\[
\text{prefix} = [-2, -1, -4, 0, -1, 1, 2, -3, 1]
\]

This means:

- `prefix[0] = -2`
- `prefix[1] = -2 + 1 = -1`
- `prefix[2] = -2 + 1 - 3 = -4`
- `prefix[3] = -2 + 1 - 3 + 4 = 0`
- And so on…

Now, to find the sum of any subarray **A[l] to A[r]**, we can compute it in **O(1)** time using:

\[
\text{sum}(A[l \dots r]) = \text{prefix}[r] - \text{prefix}[l-1]
\]

If \( l = 0 \), then:

\[
\text{sum}(A[0 \dots r]) = \text{prefix}[r]
\]

This allows **fast subarray sum computation** instead of iterating over elements every time.

---

## **Finding Maximum Subarray Using Prefix Sum**

### **Key Idea**

Instead of checking all possible subarrays (which takes \( O(n^2) \)), we leverage the **minimum prefix sum** to efficiently find the maximum subarray sum.

The **maximum sum subarray ending at index \( i \)** is given by:

\[
\text{maxSum} = \text{prefix}[i] - \text{minPrefix}
\]

where **minPrefix** is the smallest prefix sum encountered before index \( i \). This ensures that we subtract the least possible sum to maximize the subarray sum.

### **Algorithm**

1. **Compute the prefix sum array**.
2. **Iterate over the prefix sum array**:
   - Maintain a variable `minPrefix` to track the **smallest prefix sum** encountered so far.
   - Calculate `maxSum = prefix[i] - minPrefix` at each step.
   - Update `minPrefix` with `prefix[i]` if `prefix[i]` is the new minimum.

### **Step-by-Step Example**

Consider:

```java
int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
```

1. **Compute Prefix Sum Array**:

   ```
   Index:      0   1   2   3   4   5   6   7   8
   Array:     -2   1  -3   4  -1   2   1  -5   4
   Prefix:    -2  -1  -4   0  -1   1   2  -3   1
   ```

2. **Initialize `maxSum` and `minPrefix`**:

   ```
   maxSum = Integer.MIN_VALUE
   minPrefix = 0
   ```

3. **Iterate through the prefix sum array**:

| **Index (i)** | **Prefix[i]** | **maxSum = prefix[i] - minPrefix** | **minPrefix (updated)** |
|--------------|--------------|---------------------------------|--------------------|
| 0            | -2           | -2 - 0 = -2                    | **minPrefix = -2** |
| 1            | -1           | -1 - (-2) = 1                  | **minPrefix = -2** |
| 2            | -4           | -4 - (-2) = -2                 | **minPrefix = -4** |
| 3            | 0            | 0 - (-4) = **4**               | **minPrefix = -4** |
| 4            | -1           | -1 - (-4) = 3                  | **minPrefix = -4** |
| 5            | 1            | 1 - (-4) = **5**               | **minPrefix = -4** |
| 6            | 2            | 2 - (-4) = **6**               | **minPrefix = -4** |
| 7            | -3           | -3 - (-4) = 1                  | **minPrefix = -4** |
| 8            | 1            | 1 - (-4) = 5                   | **minPrefix = -4** |

### **Result**

The **maximum subarray sum** found is **6**, corresponding to the subarray `[4, -1, 2, 1]`.

---

## **Java Implementation**

```java
public class MaxSubarrayPrefixSum {
    public static int maxSubarraySum(int[] arr) {
        int n = arr.length;
        int[] prefix = new int[n];

        // Step 1: Compute the prefix sum array
        prefix[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        // Step 2: Find max subarray sum using prefix sum
        int maxSum = Integer.MIN_VALUE;
        int minPrefix = 0; // This will store the minimum prefix sum encountered

        for (int i = 0; i < n; i++) {
            maxSum = Math.max(maxSum, prefix[i] - minPrefix);
            minPrefix = Math.min(minPrefix, prefix[i]); // Update min prefix sum
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubarraySum(arr)); 
        // Output: 6 (Subarray: [4, -1, 2, 1])
    }
}
```

---

## **Time & Space Complexity Analysis**

### **Time Complexity:**

1. **Prefix sum computation:** \( O(n) \)
2. **Finding max subarray sum:** \( O(n) \)

\[
\text{Total complexity} = O(n)
\]

### **Space Complexity:**

- **Prefix sum array:** \( O(n) \) **(Extra space)**
- **Other variables:** \( O(1) \) (constant space)

\[
\text{Total space complexity} = O(n)
\]

This **extra space for prefix sum** is the main downside compared to **Kadane’s Algorithm**, which runs in \( O(n) \) but only uses **O(1) space**.

---

## **Comparison with Kadane’s Algorithm**

| Approach           | Time Complexity | Space Complexity | Key Idea |
|-------------------|---------------|----------------|----------|
| **Prefix Sum**    | \( O(n) \)    | \( O(n) \)    | Uses prefix sum and min prefix sum |
| **Kadane's Algo** | \( O(n) \)    | \( O(1) \)    | Keeps track of running max subarray sum |

**Kadane’s Algorithm** is generally preferred due to its lower space complexity. However, the **prefix sum approach** is useful when you need to **calculate multiple subarray sums efficiently**.

---

## **Conclusion**

- The **prefix sum approach** is an **efficient way** to find the **maximum subarray sum** using **O(n) time** but requires **O(n) extra space**.
- It is useful when **multiple range sum queries** are needed.
- If we only need the max subarray sum, **Kadane’s Algorithm** is **better** due to its **O(1) space** usage.

