package Practice;

import java.util.HashMap;
import java.util.Map;

public class OccuranceEachLetter {
    public static void main(String[] args) {
 String s ="kajal";

        Map<String,Integer> m = new HashMap<>();
        String[] arr=s.split("");
        for (int i = 0; i < arr.length; i++) {
            if(!m.containsKey(arr[i])){
                m.put(arr[i],1);
            }
            else {
                m.put(arr[i],m.get(arr[i])+1);
            }

        }
        for (String c:m.keySet()){
            System.out.println("count:"+c+"="+ m.get(c));
        }
              {

        }

    }
}