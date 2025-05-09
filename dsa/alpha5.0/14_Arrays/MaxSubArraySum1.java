public class MaxSubArraySum1 {
    public static void findMaxSubArraySum(int numbers[]){
        // int currSum=0;
        int maxSum = Integer.MIN_VALUE;
        int x = 0; // to store/record starting index for maximum sum sub array
        int y = 0; // to store/record last index for maximum sum sub array

        for(int i = 0; i < numbers.length;i++){
            int start=i;
            for(int j = start; j<numbers.length;j++){
                int end = j;
                int sum = 0;
                System.out.print("[");
                for(int k = start;k<=end;k++){
                    System.out.print(numbers[k]);

                    sum += numbers[k]; // adding every element in sum
                    if (k + 1 <= j) { // to print comma between elements in subarray
                        System.out.print(",");
                    }
                }
                System.out.print("]");
                
                if(maxSum<sum){
                    maxSum = sum;
                    x=start;
                    y=end;
                }

            }
            System.out.println();
        }
        if (maxSum != 0) { // Printing Highest Maximum Sum SubArray in Array
            System.out.println("Highest Sum Of Sub Array Element :" + maxSum);
            System.out.print("[ ");
            
            for (int start = x; start <= y; start++) {
                System.out.print(numbers[start]);
                if (start + 1 <= y) { // to print comma between elements in subarray
                    System.out.print(",");
                }
            }

            System.out.println(" ] ");
        }
    }
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 9, 10 };
        findMaxSubArraySum(numbers);
    }   
}
