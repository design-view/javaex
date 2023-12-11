package chap02.sec01;

import java.util.Arrays;

public class ArrayCopyExam03 {
    public static void main(String[] args) {
        String[] strArr = {"copy","array","java","jsp","oracle"};
        String[] strArrCopy = Arrays.copyOf(strArr,4);
        //Arrays.copyOfRange(원본배열, 시작인덱스, 끝인덱스(포함x))
        String[] strArrCopy2 = Arrays.copyOfRange(strArr,0,3);
        strArr[0] = "aaaa";
        System.out.println(Arrays.toString(strArr));
        System.out.println(Arrays.toString(strArrCopy));
        System.out.println(Arrays.toString(strArrCopy2));

    }
}
