package chap02.sec01;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {
    public static void main(String[] args) {
        int[] numArr = {26,88,45,44,78,10,77,65};
        Arrays.sort(numArr);
        System.out.println(Arrays.toString(numArr));
        Integer[] numArr2 = {26,88,45,44,78,10,77,65};
        Arrays.sort(numArr2, Collections.reverseOrder());
        System.out.println(Arrays.toString(numArr2));

        int[] numArr3 = {10,6,12,11,3,2};
        Arrays.sort(numArr3,2,4);
        System.out.println(Arrays.toString(numArr3));

        String[] strArr = { "Apple", "Kiwi","Orange","Banana","Cherry"};
        Arrays.sort(strArr,Collections.reverseOrder());
        System.out.println(Arrays.toString(strArr));
    }
}
