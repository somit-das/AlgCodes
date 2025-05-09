public class SelectionSort {

    public static void selectionSort(int arr[]){

        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }

        }
    }
    public static void main(String[] args) {
        // int arr[] = {5,4,3,2,1};
        int arr[] = { 2, 3, 4, 2, 1 };
        // int arr[] = {1,2,3,4,5};
        System.err.println("Before Array Sorting ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        selectionSort(arr);

        System.out.println("After Array Sorting ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

/*
 Selection Sort is different than Bubble sort where lots of swapping occur and larger element tends to move to one side.
 in Selection sort we have to pick one element and track if smaller elemnt is present in given array then pick the smallest one. if  then swap with current element (comparaing element)
 */