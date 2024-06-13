package NeetCode.Array;

import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int tar=9;
//        Input: nums = [2,7,11,15], target = 9
//        Output: [0,1]
//        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
//        Example 2:
//
//        Input: nums = [3,2,4], target = 6
//        Output: [1,2]
        System.out.println(Arrays.toString(sumCheck(tar,nums)));

    }

    public static int[] sumCheck(int tar,int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {

                if((nums[i] + nums[j]) == tar){
                    return new int[]{i,j};
                }

            }

        }

        return new int[]{-1,-1};
    }
}
