import java.util.HashMap;
import java.util.Map;

public class ArraySorted {
    public static void main(String[] args) {
        String str = "i am kajal am i and i";

        Map<String,Integer> m = new HashMap<String,Integer>();
        Integer count =1;
        String[] arr = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (!m.containsKey(arr[i])) {
                m.put(arr[i], count);
            } else
                m.put(arr[i], m.get(arr[i]) +1);
        }
        for (String x:m.keySet()) {
            System.out.println("The word count "+x+":"+m.get(x));

        }

        }

    }
