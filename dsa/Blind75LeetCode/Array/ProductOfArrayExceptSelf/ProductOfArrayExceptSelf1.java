package Array.ProductOfArrayExceptSelf;

import java.util.*;
public class ProductOfArrayExceptSelf1 {
    
    private static int[] productOfArrayexSelf(int[] arr) {
    
        int []products = new int[arr.length];
        Arrays.fill(products,1);
        
        for(int i = 0; i<arr.length;i++){
            for(int j = 0; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    continue;
                }
                else{
                    products[i] = products[i]*arr[j];
                }
            }
        }
        return products;

    }
    public static void main(String[] args) {
        
        int []newArray = {1,2,3,4};
        String dt = Arrays.toString(productOfArrayexSelf(newArray));
        System.out.println(dt);

        int []newArray2={-1,1,0,-3,3};
        dt = Arrays.toString(productOfArrayexSelf(newArray2));
        System.out.println(dt);
    }

    
}
