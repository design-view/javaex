package chap12.sec01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExam {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("김그린");
        set.add("홍길동");
        set.add("정해인");
        //외부 반복자
        //내부 반복자
        Stream<String> stream = set.stream();
        stream.forEach((item)-> System.out.println(item));
    }
}
