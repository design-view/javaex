package chap09.sec01;

import java.util.HashSet;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        //Set 인덱스 없음
        //중복 허용 안하는 자료구조
        //String[] strarr
        //Set<String> 인터페이스
        Set<String> strset = new HashSet<String>();
        strset.add("김그린");
        strset.add("홍길동");
        strset.add("박블루");
        strset.add("김그린");
        System.out.println(strset);

        Set<Member> memset = new HashSet<Member>();
        memset.add(new Member("김철수",22));
        memset.add(new Member("박철수",24));
        memset.add(new Member("홍길동",22));
        memset.add(new Member("김철수",22));
        System.out.println(memset);
    }
}
