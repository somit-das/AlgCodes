package Array.TwoSum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumSolution2 {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length;i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                // it will check if the difference or expected value present in map then it will retrieve that value
                ans[0] = map.get(diff);// index first derived  value 
                
                ans[1] = i; // index of second value; 
                break;
            }
            else{
                map.put(nums[i],i);
                /*
                here over we are storing  value of array in key side 
                and 
                value of index in value side 
                */ 
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {2,4,5};
        int arr[] = twoSum(nums,6);
        System.out.println(Arrays.toString(arr));
    }
    
}
