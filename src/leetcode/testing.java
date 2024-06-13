package leetcode;

public class testing {
    public static void main(String[] args) {
        int[] nums={3,5,0,3,4};
        find132pattern(nums);
}
    public static boolean find132pattern(int[] nums) {
  if (nums.length < 3) {
        return false;
        }
        int prevMin = Integer.MIN_VALUE;
        int potentialPeak = nums.length;
        for (int i = nums.length - 1; i >= 0; i--) {
        if (nums[i] < prevMin) {
        return true;
        }
        while (potentialPeak < nums.length && nums[i] > nums[potentialPeak]) {
        prevMin = nums[potentialPeak++];
        }
        potentialPeak--;
        nums[potentialPeak] = nums[i];
        }
        return false;
        }
}