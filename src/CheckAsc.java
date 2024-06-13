public class CheckAsc {
    public static void main(String[] args) {
        int[] arr = {1,2,8,5,9};
        System.out.println(check(arr));
    }

    static boolean check(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
              // System.out.println("ascending array");
                return false;
            }

        }
        return true;

    }
}
