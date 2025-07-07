import java.util.*;

public class BasicSorting {
    public static void bubbleSort(int arr[]) { // Bubble Sort
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 2 - turn; j++) { // as unsorted element is collected at one end
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    public static void main(String args[]) {
        int arr[] = { 5, 4, 3, 2, 1 };
        printArr(arr);
        bubbleSort(arr);
        printArr(arr);
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }
}