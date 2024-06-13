package Practice;

import java.util.Arrays;

public class Testingclass {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
//        int n = nums.length;
//        int ans[] = new int[n];
//
//        for(int i = 0; i < n; i++) {
//            int pro = 1;
//            for(int j = 0; j < n; j++) {
//                if(i == j) continue;
//                pro *= nums[j];
//            }
//            ans[i] = pro;
//        }
//
//        return ans;

            int n = nums.length;
            int[] result = new int[n];
            int[] left = new int[n];
            int[] right = new int[n];

            left[0] = 1;
            for (int i = 1; i < n; i++) {
                left[i] = left[i - 1] * nums[i - 1];
            }

            right[n - 1] = 1;
            for (int i = n - 2; i >= 0; i--) {
                System.out.println(right[i + 1]);
                right[i] = right[i + 1] * nums[i + 1];
                System.out.println(right[i + 1]);
                System.out.println(nums[i + 1]);
            }

            for (int i = 0; i < n; i++) {
                result[i] = left[i] * right[i];
            }

            return result;
        }
    }

