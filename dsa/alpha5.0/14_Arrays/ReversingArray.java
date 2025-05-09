public class ReversingArray {
    public static void reverse(int numbers[]){
        int start = 0; 
        int end = numbers.length-1;
        int temp;
        while(start<end){
            temp = numbers[start];
            numbers[start]=numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 9, 10, 12, 14, 16, 18, 20 };
        // int numbers[] = { 2, 4, 6, 8 };
        System.out.println("Before Reverse");
        for(int i = 0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

        reverse(numbers);
        System.out.println("After Reverse");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }
}

/*The most optimized way to reverse an array depends on the programming language you are using. However, in general, the most efficient approach is **in-place reversal** using the **two-pointer technique**, which runs in **O(n) time complexity** and **O(1) space complexity**.

---

### **Optimized Approach: Two-Pointer Method (In-Place)**
- Swap the first and last elements, then move towards the center.
- This avoids extra memory usage.

#### **Implementation in Different Languages**
##### **Java (Using Two-Pointer)**
```java
public class ReverseArray {
    public static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```
**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`

---

##### **JavaScript (Using Two-Pointer)**
```javascript
function reverseArray(arr) {
    let left = 0, right = arr.length - 1;
    while (left < right) {
        [arr[left], arr[right]] = [arr[right], arr[left]]; // Swap
        left++;
        right--;
    }
    return arr;
}

console.log(reverseArray([1, 2, 3, 4, 5]));
```

---

##### **Python (Using Two-Pointer)**
```python
def reverse_array(arr):
    left, right = 0, len(arr) - 1
    while left < right:
        arr[left], arr[right] = arr[right], arr[left]  # Swap
        left += 1
        right -= 1
    return arr

print(reverse_array([1, 2, 3, 4, 5]))
```

---

### **Alternative Approaches**
1. **Using Built-in Methods (Less Efficient for Large Arrays)**
   - JavaScript: `arr.reverse()`
   - Python: `arr[::-1]` (creates a new array)
   - Java: `Collections.reverse(Arrays.asList(arr))` (for Integer arrays)

2. **Using Recursion (Not Recommended for Large Arrays)**
   ```python
   def reverse_recursive(arr, left, right):
       if left >= right:
           return
       arr[left], arr[right] = arr[right], arr[left]
       reverse_recursive(arr, left + 1, right - 1)

   arr = [1, 2, 3, 4, 5]
   reverse_recursive(arr, 0, len(arr) - 1)
   print(arr)
   ```
   **Time Complexity:** `O(n)`, **Space Complexity:** `O(n)` (due to recursion stack)

---

### **Best Choice?**
- **If in-place modification is required → Two-pointer method**
- **If functional programming or simplicity is preferred → Built-in methods**
- **If recursion is preferred (not for large inputs) → Recursive method**
 */