import java.util.Arrays;

public class Searchindex2DArray {
    public static void main(String[] args) {


        int[][] arr = {{1, 2, 6},
                       {6, 9},
                       {5, 6, 8, 0, 2}};
        int target = 0;
       int [] ans=searchIndex(arr, target);
        System.out.println(Arrays.toString(ans));
    }

      static int[] searchIndex(int[][] arr, int target) {
        for (int r=0;r<arr.length;r++){
            for (int c=0;c<arr[r].length;c++){
                if(arr[r][c]==target){
                    return new int[]{r,c};

                }
            }
        }


          return new int[]{-1,-1};
      }
}