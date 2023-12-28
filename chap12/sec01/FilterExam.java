package chap12.sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterExam {
    public static void main(String[] args) {
        //리스트 컬랙션 생성
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("김그린");
        list.add("정해인");
        list.add("김블루");
        list.add("김그린");
        //중복요소 제거
        Stream<String> stream = list.stream();
        stream.distinct()
                .forEach(str-> System.out.println(str));
        //김으로 시작하는 요소만
        String str = "김그린";
        System.out.println(str.startsWith("이"));
        System.out.println("==========================");
        list.stream().distinct().filter(item->item.startsWith("김"))
                .forEach(item-> System.out.println(item));
    }
}
