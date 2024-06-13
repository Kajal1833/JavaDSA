package leetcode;

public class Practice_132_Pattern {
    public static void main(String[] args) {
       int[] nums={3,5,0,3,4};
        find132pattern(nums);
       // System.out.println(find132pattern(nums));
    }
    public static boolean find132pattern(int[] nums) {
      int  i = 0;
      int j=i+1;
      int k = i+2;
        for ( i = 0; k < nums.length-1; i++) {
            j=i+1;
            k=i+2;
            if (nums[i] < nums[k] && nums[k] < nums[j]) {
                return true;
            }
        }
        return false;
    }

}
