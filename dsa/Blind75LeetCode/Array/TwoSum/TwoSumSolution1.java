package Array.TwoSum;

import java.util.Arrays;

public class TwoSumSolution1 {
    
    private static int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        ans[0]=Integer.MIN_VALUE;
        ans[1]=Integer.MAX_VALUE;
        for(int i = 0; i<nums.length-1;i++){
            for(int j = 0; j<nums.length-1;j++){
                if(nums[i] + nums[j] == target&& i==j){
                    continue;
                }
                if(nums[i]+nums[j]==target){
                    ans[0] = i;
                    ans[1] = j;
                    break;
                }
            }
        }
       return ans;
    }
    public static void main(String[] args) {
        int nums[] = {2,4,5};
        int arr[] = twoSum(nums,4);
        System.out.println(Arrays.toString(arr));
    }


}
