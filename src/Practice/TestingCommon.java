package Practice;

import java.util.*;

public class TestingCommon {
    public static void main(String[] args) {
        int[] a={1,5,9,11,3,2,1};
        int[] b={1,2,3};
        int[] c ={1,2,3,4};

        System.out.println(findCommonElement(a));
    }
    public static int findCommonElement(int[] a) {
        Arrays.sort(a);
//        Set<Integer> A = new HashSet<>();
//        for (int num : a) {
//            A.add(num);
//        }
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();

        // adding elements to LinkedHashSet
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);

        // Print the elements of LinkedHashSet
       int n = set.size();
      // System.out.print(set);
        int arr[] = new int[n];

        int i = 0;
        for (int x : set)
            arr[i++] = x;
        // set.
        return arr[arr.length-2];
    }
}
