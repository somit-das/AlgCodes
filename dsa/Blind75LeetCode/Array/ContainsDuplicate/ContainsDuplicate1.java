package Array.ContainsDuplicate;

import java.util.Set;
import java.util.HashSet;

public class ContainsDuplicate1 {
    
    public static boolean duplicateContain(int nums[]){
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i <nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int []sampleArray =  {3,4,5,5};
        
        System.out.println(duplicateContain(sampleArray));
        

    }
}

//TC : o(n), SC: O(n)