package chap05.sec04;

import java.util.Arrays;

public class StringExam02 {
    public static void main(String[] args) {
            //"oxooxoxxox"	[1, 2, 1, 0, 1, 0]
           String myString = "xabcxdefxghi";
           //[o, oo, o, , o]  --> [1,2,1,0,1,0]
           String[] arr =  myString.split("x");
           System.out.println(Arrays.toString(arr));
           int arrsize = myString.charAt(myString.length()-1) == 'x' ?
                   arr.length+1 : arr.length;
           int[] intarr = new int[arrsize];
           //[0,0,0,0,0,0]
           for (int i = 0; i < arr.length; i++) {
               intarr[i] = arr[i].length();
           }
           System.out.println(Arrays.toString(intarr));
            String str2 = "banana";
            String str3 = str2.substring(2);
            System.out.println(str3);
    }
}
