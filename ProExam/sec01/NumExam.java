package ProExam.sec01;

import java.math.BigInteger;
import java.util.Arrays;

public class NumExam {
    public static void main(String[] args) {
        double a = Double.parseDouble("18446744073709551615")+Double.parseDouble("287346502836570928366");
//        String a = Long.parseLong("18446744073709551615")+"";
        System.out.println(a);
        BigInteger num1 = new BigInteger("18446744073709551615");
        int[] arr = Arrays.stream(new int[] {0,1,1,2,2,3}).distinct().toArray();
        System.out.println(Arrays.toString(arr));
        int[] arr2 = new int[3];
        System.arraycopy(arr, 0, arr2,0,arr.length);
        System.out.println(Arrays.toString(arr2));
    }
}
