package leetcode;

public class DuplicateFind {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 6, 3, 6, 1};
        int n=7;
        System.out.println(checkDuplicate(arr,n));
    }

    private static int checkDuplicate(int[] arr, int n) {
        for (int i = 0; i < n-1; i++) {
            if(arr[i]==arr[i+1]){
                return arr[i];
            }

        }
        return 0;
    }
}
