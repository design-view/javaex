package chap11.sec02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemberSetExam {
    public static void main(String[] args) {
        Set<Member> mset = new HashSet<>();
        mset.add(new Member("김그린",30));
        mset.add(new Member("홍길동",22));
        mset.add(new Member("김사랑",30));
        mset.add(new Member("김그린",30));
        System.out.println(mset.size());

        Iterator<Member> miter = mset.iterator();
        while (miter.hasNext()){
            Member m = miter.next();
            System.out.println("이름은 : " + m.getName()
                    + "이고 나이는 : "+m.getAge()+"입니다.");
        }
        for (Member m2:
             mset) {
            System.out.println("이름은 : " + m2.getName()
                    + "이고 나이는 : "+m2.getAge()+"입니다.");
        }
    }
}
