//package array_Practice;

import java.util.Arrays;

public class Swap2Indexes {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int [] arr= {2,6,8,9,5,22};
        swapIndexes(arr,1,3);
        System.out.println(Arrays.toString(arr));
//        reverse(arr);
//        System.out.println(Arrays.toString(arr));
    }


    static void reverse(int[] arr) {
        // TODO Auto-generated method stub
        int start=0;
        int end=arr.length-1;
        while(start<end) {
            swapIndexes(arr,start,end);
            start++;
            end--;

        }

    }


    static void swapIndexes(int[] arr,int start, int end) {
        // TODO Auto-generated method stub
        int temp=0;
           temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

        //return temp;
    }

}
