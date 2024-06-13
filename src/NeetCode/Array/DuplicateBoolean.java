package NeetCode.Array;

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateBoolean {
    public static void main(String[] args) {
        int[] array={1,7,7,5,4,9,2};
        duplicate(array);
    }
    public static boolean duplicate(int[] nums){
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length-1; i++) {
//            if(nums[i]==nums[i+1]){
//                return true;
//            }
//
//        }
//        return false;
        HashSet<Integer> has = new HashSet<>();
        for(int num:nums){
            if(has.contains(num)){
                return true;
            }







        }
        return false;
    }


}
