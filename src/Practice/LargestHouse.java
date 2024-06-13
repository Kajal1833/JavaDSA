package Practice;

public class LargestHouse {
    public static void main(String[] args) {
     int[] nums = {1,2,3,1};
        System.out.println(rob(nums));
    }

    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];

        int prevMax = 0;
        int currMax = 0;

        for (int num : nums) {
            int temp = currMax;
            currMax = Math.max(prevMax + num, currMax);
            prevMax = temp;
        }

        return currMax;
    }
    }


