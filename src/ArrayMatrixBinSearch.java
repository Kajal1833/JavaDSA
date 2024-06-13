import java.util.Arrays;

public class ArrayMatrixBinSearch {
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 22;
        System.out.println(Arrays.toString(searchMatrix(matrix, target)));
    }

    static int[] searchMatrix(int[][] matrix, int target) {
      int r = 0;
      int c = matrix[r].length-1;
      while (r<matrix.length && c>=0){
          if(matrix[r][c]==target){
              return new int[]{r,c};
          }
          if (matrix[r][c]<target){
              r++;
          }
          else {
              c--;
          }
      }

        return new int[]{-1,-1};
    }
}
