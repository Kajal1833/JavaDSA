import java.util.Arrays;

public class SunArray {
    public static void main(String[] args) {
       int[] nums = {3,2,3};
        int target = 6;
        int[] arr=twoSum(nums,target);
        System.out.println(Arrays.toString(arr));
    }

        static int[] twoSum(int[] nums, int target) {
            // int sum = nums[0]+num[1];

            for(int i=0;i<=nums.length;i++){
                int j=0;
                int r=nums[0];

                if((r+nums[i+1])==target){
                    return new int[]{r,i+1};}


            }
            return new int[]{-1,-1};
        }
    }

