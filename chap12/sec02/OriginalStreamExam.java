package chap12.sec02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OriginalStreamExam {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        //정수 배열을 리스트로 변환
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        //리스트를 정수 배열로
        int[] arr2 = list.stream().mapToInt(s->s.intValue()).toArray();
        System.out.println(Arrays.toString(arr2));
        //숫자범위 IntStream, LongStream
        IntStream.rangeClosed(1,10).forEach(n-> System.out.println(n));



    }

}
