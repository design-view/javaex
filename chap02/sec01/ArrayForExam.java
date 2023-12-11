package chap02.sec01;

import java.util.Arrays;

public class ArrayForExam {
    public static void main(String[] args) {
        String[] names = {"a","b","c","d","e"};
        //names[5] = "f";
        for (String name: names) {
            System.out.println(name);
        }
        //배열을 출력 Arrays.toString(배열);
        System.out.println(Arrays.toString(names));
        int[] nums = {10,5,6,7,2};
        int minNum;  //nums배열의 최소값 구하기
        minNum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            minNum = minNum > nums[i] ? nums[i] : minNum;
        }
        System.out.println("배열에서 가장 작은 값은 ? " + minNum);

    }
}
