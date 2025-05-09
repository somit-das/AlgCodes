package Array.ProductOfArrayExceptSelf;

import java.util.*;
public class ProductOfArrayExceptSelf2 {
 
    private static int[] productOfArrayexSelf(int[] nums) {
        int []prefixProductArr = new int[nums.length];
        int []suffixProductArr = new int[nums.length];
        int []resultantProductArr = new int[nums.length];
        int preProduct=1;
        int sufProduct=1;
        for(int i = 0; i < nums.length;i++){
            if(i==0){
                prefixProductArr[i]=1;
            }else{
                preProduct=preProduct*nums[i-1];
                prefixProductArr[i]=preProduct;
            }
        }
        // System.out.println(Arrays.toString(prefixProductArr));
        for (int j = nums.length-1; j >=0; j--) {
            if (j == nums.length-1) {
                suffixProductArr[j] = 1;
            } else {
                sufProduct = sufProduct*nums[j+1];
                suffixProductArr[j] = sufProduct;

            }
        }
        // System.out.println(Arrays.toString(suffixProductArr));
        for(int x = 0; x<nums.length;x++){
            resultantProductArr[x]=prefixProductArr[x]*suffixProductArr[x];
        }
        return resultantProductArr;
        
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
