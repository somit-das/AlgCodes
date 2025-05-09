public class PrintingSubArrays {

    public static void printSubArray(int arr[]){
        int ts = 0;
        System.out.println("SubArrays :- ");
        for(int i = 0;i < arr.length;i++){

            for(int j = i;j<arr.length;j++){  //here j = i not j = i+1 like in Pairs in Array as we printing the first single element of array 

                System.out.print("[");  // to enclose with bracket

                for(int k=i; k<=j;k++){
                    System.out.print(arr[k]);
                    
                    if(k+1<=j){             // to print comma between elements in subarray
                        System.out.print(",");
                    }
                }

                System.out.print("] "); // to enclose with bracket
                ts++; // using ts to count subarray can formed using given array
            }
            System.out.println();
        }

        System.out.println("Total SubArrays :" + ts);
    }
    public static void main(String[] args) {
        
        int numbers[] = { 2, 4, 6, 8, 9, 10 };
        printSubArray(numbers);
    }
}
