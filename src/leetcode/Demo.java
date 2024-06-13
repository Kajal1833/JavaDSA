package leetcode;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        printNumbers(1, 100);
    }

    public static void printNumbers(int start, int end) {
        if (start <= end) {
            System.out.println(start);
            printNumbers(start + 1, end);
        }
    }
}
//
//        String s = "I am an Akamai Employee";
//
//        Scanner sc = new Scanner(System.in);
//        sc.nextLine();
//
//
//   String[] words =  s.split("\\s");;
//   StringBuilder i = new StringBuilder();
//        for (int j = words.length-1; j >=0 ; j--) {
//         //   i.append(words)
//





