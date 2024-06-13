public class MaxNum2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 6},
                       {6, 9},
                       {5, 6, 8, 0, 2}};
        maxNum(arr);
        System.out.println( maxNum(arr));
    }

   static int maxNum(int[][] arr) {
        int max=arr[0][0];
       for (int[] ints : arr) {
           for (int anInt : ints) {
               if (anInt > max) {
                   max = anInt;

               }
           }
       }
       return max;
   }
}

