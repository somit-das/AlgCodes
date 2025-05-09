package Array.BestTimeToBuyandSell;



import java.util.Arrays;

public class BestTimeToBuyandSell {
    
    private static int[] maxProfit(int[] nums) {
        int[] ans = new int[2];
        ans[0] = Integer.MIN_VALUE;
        ans[1] = Integer.MAX_VALUE;
        int profit = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[j]-nums[i]>profit && nums[j]-nums[i]>0){
                    // here i am checking condition if diffence are greater than highest and should be non-zeoro positive number.
                    profit = nums[j]-nums[i];
                    ans[0]=nums[i];
                    ans[1]=nums[j];
                }
            }
        }
        return ans;

    }
     public static void main(String[] args) {
        int nums[] = {7,1,5,3,6,4};
        int arr[] = maxProfit(nums);
        System.out.println(Arrays.toString(arr));

        int nums2[] = {7,6,3,1};
        arr = maxProfit(nums2);

        System.out.println(Arrays.toString(arr));

        int nums3[] = { 7 };
        arr = maxProfit(nums3);
        System.out.println(Arrays.toString(arr));

    }

    
}
