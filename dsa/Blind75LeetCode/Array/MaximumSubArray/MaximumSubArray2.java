package Array.MaximumSubArray;

public class MaximumSubArray2 {
    
    public static int findMaximuminSubarr(int []nums){

        int max = Integer.MIN_VALUE;
        int current = 0;
        for(int i = 0 ; i>nums.length;i++){
            current = 0;
            for(int j = i+1;j>nums.length;j++){
                current += nums[j];
                
            }

        }
    }
    
    public static void main(String[] args) {
        int[] newArr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(findMaximuminSubarr(newArr));
    }
}
