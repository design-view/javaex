package chap02.sec01;

import java.util.Arrays;

public class ArrayCopyExam02 {
    public static void main(String[] args) {
        String[] str1 = {"a","b","c"};
        String[] str2 = new String[5];
        System.arraycopy(str1,0,str2,2, 3);
        System.out.println(Arrays.toString(str2));
    }
}
