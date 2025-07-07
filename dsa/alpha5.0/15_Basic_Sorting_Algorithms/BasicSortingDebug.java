import java.util.*;

public class BasicSortingDebug{
    public static void bubbleSort(int arr[]){
        int swap = 0;
        int count = 0;
        
        for(int turn = 0;turn<arr.length-1;turn++){
            for(int j = 0; j<=arr.length-2-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
                count++;
            }
        }
        System.out.println("Count : "+count);
        System.out.println("Swap : "+swap);


    }
    public static void main(String args[]){
        int arr[] = {5,4,3,2,1};
        printArr(arr);
        bubbleSort(arr);
        printArr(arr);
        
        int arr2[] = {1,2,3,4,5};
        printArr(arr2);
        bubbleSort(arr2);
        printArr(arr2);
    }
  
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+ " ");

        }
        System.out.println();
    }
}