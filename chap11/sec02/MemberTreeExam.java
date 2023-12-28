package chap11.sec02;

import java.util.NavigableSet;
import java.util.TreeSet;

public class MemberTreeExam {
    public static void main(String[] args) {
        TreeSet<Member> tree = new TreeSet<>();
        tree.add(new Member("정해인", 26));
        tree.add(new Member("원빈", 40));
        tree.add(new Member("전두광", 35));
        tree.add(new Member("이동욱", 38));
        tree.add(new Member("공유", 39));

        Member mf = tree.first();
        System.out.println(mf.getName() + " , " + mf.getAge() );
        NavigableSet<Member> ntreeset =  tree.tailSet(new Member("김그린", 30),true);
        System.out.println("===============================");
        for (Member m:
             ntreeset) {
            System.out.println(m.getName()+" , "+m.getAge() );
        }
    }
}
