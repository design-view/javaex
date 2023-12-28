package chap12.sec02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MiddleStreamExam {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,1,2,3,4};

        //1.distinct() 중복제거
        //2.filter() 조건에 맞는 요소만 새스트림으로
        int sum = Arrays.stream(arr).distinct()
                .filter(n->n%2==0)
                .sum();
        List<Member> mlist = new ArrayList<>();
        mlist.add(new Member("김수정",22));
        mlist.add(new Member("정해인",21));
        mlist.add(new Member("공유",28));

        //3.map() 요소변환
        mlist.stream().filter(m->m.getAge()%2==0).mapToInt(m->m.getAge())
                .forEach(a-> System.out.println(a));

        mlist.stream()
                .map(m->m.getName())
                .forEach(name-> System.out.println(name));

        //4.sorted() 정렬 Comparable인터페이스 구현
        int[] arr2 = {50,60,1,10,22,65,55,70};
        Arrays.stream(arr2)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .forEach(n-> System.out.println(n));

        mlist.stream()
                .sorted((m1,m2)->Integer.compare(m1.getAge(), m1.getAge()))
                .forEach(m-> System.out.println(m.getAge()));

        mlist.stream()
                .sorted(new Comparator<Member>() {
                    @Override
                    public int compare(Member o1, Member o2) {
                        return Integer.compare(o1.getAge(),o2.getAge());
                    }
                }).forEach(m-> System.out.println(m.getAge()));
    }
}
