package chap12.sec01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExam02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("가");
        list.add("나");
        list.add("다");
        list.add("라");

        //컬렉션에서 스트림(객체스트림) 객체 생성 list.stream()
        Stream<String> liststream = list.stream();

        //배열에서 스트림(객체스트림, 인트스트림, 더블스트림, 롱스트림)
        //객체 생성 Arrays.stream(배열)
        String[] strarr = {"a","b","c","d","e"};
        Stream<String> arrstream = Arrays.stream(strarr);
        arrstream.forEach(item-> System.out.println(item));
        int[] intarr = {1,2,3,4,5};
        IntStream intstream = Arrays.stream(intarr);
        int sum = intstream.sum();
        System.out.println("합계는 : " + sum);

        //숫자범위로부터 스트림 객체 생성
        //IntStream.range(start, end)        end포함안함
        //IntStream.rangeClosed(start, end)  end포함
        IntStream intstream2 = IntStream.range(1,10);
        intstream2.forEach(item-> System.out.println(item));
        IntStream intstram3 = IntStream.rangeClosed(1,10);
        intstram3.forEach(item-> System.out.println(item));
    }
}
