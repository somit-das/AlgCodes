//Kadane's Algorithm
public class MaxSubArraySum3 {

    public static void findMaxSubArraySum(int numbers[]) {
        boolean flag = false;
        int csum = 0;
        int msum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) { // for loop to search if all negative number present in array, if not then flag will be set to true
            if (numbers[i] >= 0) {
                flag = true;
                break;
            }
        }
        if (!flag) {        //checking if it is flagged
            for (int i = 0; i < numbers.length; i++) {
                msum = Math.max(msum, numbers[i]);
            }

            System.out.println("Maximum Sub Array Sum is " + msum);
            return;
        } else {            //else run the else statement
            for (int i = 0; i < numbers.length; i++) {
                csum = csum + numbers[i];
                if (csum < 0) {
                    csum = 0;
                }
                msum = Math.max(csum, msum);
            }
            System.out.println("Maximum Sub Array Sum is " + msum);
        }
    }

    public static void findMaxSubArraySum2(int numbers[]) {
        int maxSum = numbers[0]; // Start with first element
        int currentSum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            currentSum = Math.max(numbers[i], currentSum + numbers[i]); // Expand or start fresh
            maxSum = Math.max(maxSum, currentSum); // Update max sum
        }

        System.out.println("Maximum Sub Array Sum is " + maxSum);
    }

    public static void main(String[] args) {
        // int numbers[] = { 2, 4, 6, 8, 9, 10 };
        // int numbers[] = { 1, 2, 3, 4, 5 };
        // int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int numbers[] = {-2,-3,-3,-4,-5,-6};
        findMaxSubArraySum(numbers);
        findMaxSubArraySum2(numbers);
    }
}
