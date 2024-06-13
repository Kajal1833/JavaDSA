public class MaximumValueArray {
    public static void main(String[] args) {


    int[] arr={1,6,9,8,7,0,5,3};
        int result = max(arr);
        System.out.println(result);

}

 static int max(int[] arr) {
        int maxVal=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
     return maxVal;
 }


    }

