package chap12.sec01;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MatchIntExam {
    public static void main(String[] args) {
        int[] numArr = {2,4,6,8,10,12,11};
        //모두 2의 배수인가?
        boolean result1 = Arrays.stream(numArr).allMatch(num->num%2==0);
        System.out.println("모두 2의 배수이냐? " + result1);
        boolean result2 = Arrays.stream(numArr).anyMatch(num->num%3==0);
        System.out.println("하나라도 3의 배수가 있나요? " + result2);
        //음수가 없나요
        boolean result3 = Arrays.stream(numArr).noneMatch(num-> num < 0);
        System.out.println("음수가 없나요?" + result3);
    }
}
