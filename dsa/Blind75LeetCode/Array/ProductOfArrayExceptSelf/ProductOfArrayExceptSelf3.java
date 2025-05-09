package Array.ProductOfArrayExceptSelf;

import java.util.Arrays;

public class ProductOfArrayExceptSelf3  {
    private static int[] productOfArrayexSelf(int[] nums) {
       
        int[] prefixProductArr = new int[nums.length];
        int[] resultantArr = new int[nums.length];
        int sufProduct=1;
        
        for(int i = 0; i < nums.length;i++){
            if(i==0){
                prefixProductArr[i] = 1;
            }
            else 
                prefixProductArr[i] = prefixProductArr[i-1] * nums[i-1];
        }
        for(int i = nums.length-1; i>=0;i--){
            if(i==nums.length-1){
                resultantArr[i] = prefixProductArr[i]*sufProduct; 
                sufProduct = nums[i];
            }else{
                
                resultantArr[i] = sufProduct*prefixProductArr[i];
                sufProduct = sufProduct*nums[i];
            }
        } 
        return resultantArr;
    }

    public static void main(String[] args) {
        
        int[] newArray = { 1, 2, 3, 4 };
        String dt = Arrays.toString(productOfArrayexSelf(newArray));
        System.out.println(dt);
        
        int[] newArray2 = { -1, 1, 0, -3, 3 };
        dt = Arrays.toString(productOfArrayexSelf(newArray2));
        System.out.println(dt);
    }
}
