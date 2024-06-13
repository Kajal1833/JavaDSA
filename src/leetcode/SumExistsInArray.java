package leetcode;

public class SumExistsInArray {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
         int x= -2;
        System.out.println(checkSumExist(arr,x));

}

    private static boolean checkSumExist(int[] arr, int x) {

        for (int i=0;i<arr.length-1;i++){
            if((arr[i]+arr[i+1])==x){
                return true;
            }

        }
        return false;
    }




}
