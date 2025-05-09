
public class BubbleSort {
    public static void bubbleSort1(int arr[]){
       
        for(int i=0;i<=arr.length-2;i++){  //here 5 lengthed array will run i for loop run 4 times , j for loop run 4-i ignoring already sorted 
            boolean swapped = false;
            for(int j =0 ;j<=arr.length-2-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break; // If no swaps, array is already sorted
            }
        }
    }
    public static void bubbleSort2(int arr[]){
        for (int i = arr.length - 1; i > 0; i--) { // here 5 lengthed array will run i for loop run 4 times , j for loop depending upon i and everytime i will decrement ignoring already sorted
            boolean swapped = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break; // If no swaps, array is already sorted
        }
    }
    public static void main(String[] args) {
        // int arr[] = {5,4,3,2,1};
        int arr[] = {2,3,4,2,1};
        // int arr[] = {1,2,3,4,5};
        System.err.println("Before Array Sorting ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubbleSort1(arr);

        System.out.println("After Array Sorting ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

/*

Both versions implement **Bubble Sort**, but they have slight differences in iteration order. Let's analyze each:

---

### **1st Bubble Sort Implementation**
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
for(int i=0;i<=arr.length-2;i++){
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
| **Aspect**        | **1st Implementation** | **2nd Implementation** |
|------------------|---------------------|---------------------|
| **Outer loop direction** | Starts from the last index and moves down (`size-1` to `1`) | Starts from `0` and moves up (`0` to `size-2`) |
| **Inner loop range** | `0` to `i-1` | `0` to `arr.length-2-i` |
| **Sorting effect** | Moves the largest element to its correct position in each iteration | Moves the largest element to its correct position in each iteration |
| **Efficiency** | Same time complexity (O(n²)) | Same time complexity (O(n²)) |
| **Clarity** | More intuitive as `i` represents the unsorted portion | More traditional approach in textbooks |

---

### **Which One is Better?**
Both implementations are logically correct and produce the same sorted output. However, the **first implementation** is slightly **more intuitive**, as `i` directly represents the shrinking unsorted portion of the array. 

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
 */