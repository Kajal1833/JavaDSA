import java.util.Arrays;

public class MissingNum {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        //missing(arr);
        System.out.println(missing(arr));
    }
   static int missing(int[] arr){
        int i = 1;
        while(i < arr.length){
         int correctele = arr[i] -1 ;
         if(arr[i]!= arr[correctele] ){
             swap(arr,i,correctele);
         }
          else {
             i++;
         }

        }
       for (int index =0; index<arr.length;index++){
           if(arr[index]!= index+1){
               return index;
           }
       }
       return arr.length;
   }

    static void swap(int[] arr, int first, int end) {
        int temp = arr[first];
        arr[first]=arr[end];
        arr[end]=temp;
    }
}
