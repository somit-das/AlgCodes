//OPTIMIZED BUBBLESORT
public class BubbleSort2{
    public static void optimizedBubbleSort1(int[] arr){
        int swap = 0;   // track how many swap is happening
        int count = 0;  // track loop run or time complexity
        for(int turn = 0; turn <= arr.length-2; turn++){
            for(int j = 0 ; j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
                count++;
            }
        }

        System.out.println("Total Swap:- "+swap);
        System.err.println("Total LoopRun/ Count/ TimeComplexity:- "+count);
    }
    public static void optimizedBubbleSort2(int[] arr){

        int swap = 0;   // track how many swap is happening
        int count = 0;  // track loop run or time complexity
        for(int turn = 0; turn <= arr.length-2; turn++){
            boolean swapped = false;
            for(int j = 0 ; j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                    swapped = true;
                }
               count++;
            }
            if(!swapped) break;
            
        }
        System.out.println("Total Swap:- "+swap);
        System.err.println("Total LoopRun/ Count/ TimeComplexity:- "+count);
    }

    public static void main(String[] args) {
        int [] arr1 = {5,4,3,2,1};
        int [] arr11 = {5,4,3,2,1};
        int [] arr2 = {1,2,3,4,5};
        int [] arr21 = {1,2,3,4,5};
        printArr(arr1);
        optimizedBubbleSort1(arr1);
        printArr(arr1);

        System.out.println();

        printArr(arr11);
        optimizedBubbleSort2(arr11);
        printArr(arr11);

        System.out.println();

        printArr(arr21);
        optimizedBubbleSort1(arr21);
        printArr(arr21);

        System.out.println();

        printArr(arr2);
        optimizedBubbleSort2(arr2);
        printArr(arr2);
    }

    public static void printArr(int [] arr){
        for (int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    
}