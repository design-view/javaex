package chap12.sec01;

import java.util.ArrayList;
import java.util.List;

public class SortExam {
    public static void main(String[] args) {
        List<Member> memberList = new ArrayList<>();
        memberList.add(new Member("원빈",40));
        memberList.add(new Member("공유",38));
        memberList.add(new Member("정해인",27));

        //스트림 파이프라인
        //오리지널스트림 ---> 중간스트림 --> 최종처리

        memberList.stream()
                .sorted((m1,m2)->Integer.compare(m2.getAge(), m1.getAge()))
                .forEach(s-> System.out.println(s.getName()+" : " + s.getAge()));

    }
}
