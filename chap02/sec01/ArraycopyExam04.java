package chap02.sec01;

import java.util.Arrays;

public class ArraycopyExam04 {
    public static void main(String[] args) {
        String[] strArr1 = {"exam","banana"};
        String[] strArr2 = {"system","method","class"};
        String[] strArr3 = new String[strArr1.length+strArr2.length];

        System.arraycopy(strArr1,0, strArr3,0,strArr1.length);
        System.arraycopy(strArr2,0, strArr3,strArr1.length,strArr2.length);

        int[] intArr1 = {1,2,3,4,5};
        int[] intArr2 = Arrays.copyOf(intArr1,10);
        int[] intArr3 = Arrays.copyOfRange(intArr1,0,4);
        System.out.println(Arrays.toString(strArr3));
        System.out.println(Arrays.toString(intArr2));
        System.out.println(Arrays.toString(intArr3));

        int[] intArr4 = {10,5,67,2,20,30,8};
        //오름차순 정렬 Arrays.sort(배열)
        Arrays.sort(intArr4);
        System.out.println(Arrays.toString(intArr4));
    }
}
