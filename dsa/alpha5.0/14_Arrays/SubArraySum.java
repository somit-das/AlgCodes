public class SubArraySum {
    
    public static void printSumOfSubArrayElement(int numbers[]){
        int max=Integer.MIN_VALUE;
        int x=0; // to store/record starting index for maximum sum sub array
        int y=0; // to store/record last index for maximum sum sub array
        for(int i = 0;i<numbers.length;i++){
            for(int j = i;j<numbers.length;j++){
                int sum = 0;
                System.out.print("[");
                for(int start = i; start <=j;start++){
                    System.out.print(numbers[start]);

                    sum+=numbers[start];    // adding every element in sum
                    if (start + 1 <= j) { // to print comma between elements in subarray
                        System.out.print(",");
                    }
                }

                System.out.print("] => ");
                System.out.print("sum :"+sum+"  "); 
                if(sum>max){  //
                    max=sum;
                    x=i;
                    y=j;
                }
            }
            System.out.println();
        }

        if(max!=0){     //Printing Highest Maximum Sum SubArray in Array
            System.out.print("[ ");
            for (int start = x; start <= y; start++) {
                System.out.print(numbers[start]);
                if (start + 1 <= y) { // to print comma between elements in subarray
                    System.out.print(",");
                }
            }

            System.out.print(" ] ");

            System.out.println("Highest Sum Of Sub Array Element :" + max);
        }
    }
    public static void main(String[] args) {

        // int numbers[] = { 2, 4, 6, 8, 9, 10 };
        int numbers[] = {1,-2,6,-1,3};
        printSumOfSubArrayElement(numbers);
    }
}
