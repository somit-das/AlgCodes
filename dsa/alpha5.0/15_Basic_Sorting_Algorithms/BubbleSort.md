# Bubble Sort

3 versions to implement **Bubble Sort**, but they have slight differences in iteration order. Let's analyze each:

---

### **1st Bubble Sort Implementation (Traditional)**

```java
for(int i = size - 1; i > 0 ; i --){
    for(int j = 0 ; j < i ; j++ ){
        if(array[j] > array[j+1]){
            int temp = array[j];
            array[j] = array[j+1];
            array[j+1] = temp;
        }
    }
}
```

#### **Analysis:**

- The **outer loop (i)** starts from `size - 1` and decrements to `1`. This means we are shrinking the unsorted section of the array from the end.
- The **inner loop (j)** runs from `0` to `i - 1`, meaning it stops before the last sorted element in each pass.
- This ensures that the largest element moves to its correct position in each iteration.
- The range of `j` changes dynamically as the unsorted portion reduces.

---

### **2nd Bubble Sort Implementation**

```java
for(int i=0;i<=arr.length-2;i++){  // here it is modified version of mam's way 
    for(int j =0 ;j<=arr.length-2-i;j++){
        if(arr[j]>arr[j+1]){
            int temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
        }
    }
}
```

#### **Analysis:**

- The **outer loop (i)** starts from `0` and runs up to `arr.length - 2`. This means we are shrinking the unsorted section from the beginning.
- The **inner loop (j)** runs from `0` to `arr.length - 2 - i`. This ensures that we don't compare already sorted elements at the end.
- The range of `j` dynamically decreases just like in the first approach.

---


### **Key Differences:**

| **Aspect**               | **1st Implementation**                                              | **2nd Implementation**                                              |
| ------------------------ | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| **Outer loop direction** | Starts from the last index and moves down (`size-1` to `1`)         | Starts from `0` and moves up (`0` to `size-2`)                      |
| **Inner loop range**     | `0` to `i-1`                                                        | `0` to `arr.length-2-i`                                             |
| **Sorting effect**       | Moves the largest element to its correct position in each iteration | Moves the largest element to its correct position in each iteration |
| **Efficiency**           | Same time complexity (O(n²))                                        | Same time complexity (O(n²))                                        |
| **Clarity**              | More intuitive as `i` represents the unsorted portion               | More traditional approach in textbooks                              |

---

### **Which One is Better?**

Both implementations are logically correct and produce the same sorted output. However, the **first implementation** is slightly **more intuitive**, as `i` directly represents the shrinking unsorted portion of the array while **second implementation** is more optimized than other.

If you want an optimized Bubble Sort, consider adding a **swap flag** to check if the array is already sorted, reducing unnecessary passes:

```java
for(int i = size - 1; i > 0 ; i--){
    boolean swapped = false;
    for(int j = 0 ; j < i ; j++ ){
        if(array[j] > array[j+1]){
            int temp = array[j];
            array[j] = array[j+1];
            array[j+1] = temp;
            swapped = true;
        }
    }
    if(!swapped) break; // If no swaps, array is already sorted
}
```

This improves performance for nearly sorted arrays. 🚀
