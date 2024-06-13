public class MountainProblem {
    public static void main(String[] args) {
        int [] arr= {0,1,0};
        problem(arr);
        System.out.println(problem(arr));
    }

     static int problem(int[] arr) {
      int start=0;
      int end = arr.length-1;
      while(start<=end){
          int mid=start + (end-start)/2;//6 //4
          if(arr[mid]>arr[mid+1]){
              end=mid;// s=7 , e=4

          }
          else if (arr[mid]<arr[mid+1]) {
              start=mid+1;//s=7 and e=0

          }
         if(start==end && end==mid) {
             return arr[mid];
       }


      }
         return -1;
     }



}
//33. Search in Rotated Sorted Array