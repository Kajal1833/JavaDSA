package leetcode;

import java.util.Arrays;

public class TwoSumSort {
    public static void main(String[] args) {
        
    
    int[] arr = {1, 4, 45, 6, 10, -8};
    int sum = 16;
        System.out.println(checkSortSum(arr,sum));

}

    private static int checkSortSum(int[] arr, int sum) {
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while (i<j){
            if((arr[i]+arr[j])==sum){
                return 1;
            } else if ((arr[i]+arr[j])<sum) {
                i++;
            }
           else {
            j--;
           }

        }
        return 0;
    }
}
