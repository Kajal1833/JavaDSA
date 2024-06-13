package NeetCode.Array;

import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {


    String a="kajal";
    String b="jakal";
        System.out.println(validCheck(a,b));
    }
public static boolean validCheck(String a, String b){
    char[] x= a.toCharArray();
    char[] y = b.toCharArray();
    Arrays.sort(x);
    Arrays.sort(y);

    if (x.length!=y.length){
        return false;
    }
    String x1 = new String(x);
    String y1 = new String(y);

    if(x1.equals(y1)){
        return true;
    }
    return false;
}

}
