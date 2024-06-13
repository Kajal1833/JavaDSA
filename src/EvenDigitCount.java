import java.util.Arrays;



public class EvenDigitCount {
    public static void main(String[] args) {
        int[] nums={451,689,1076,76864,357429};
        System.out.println(countDigit(nums));
    }

  static int countDigit(int[] nums) {
      int count=0;
      for (int num:nums) {
          if(even(num)){
            count++;

      }

    }


      return count;
  }

     static boolean even(int num) {
     int  digitCount= digit(num);
         return digitCount % 2 == 0;
     }

      static int digit(int num) {
        if(num>0){
            int count=0;
            count++;
            num=num/10;
        }
          return num;
      }

}

