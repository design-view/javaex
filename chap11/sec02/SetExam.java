package chap11.sec02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Set<String> strset = new HashSet<String>();
        //add()
        strset.add("김그린");
        strset.add("홍길동");
        strset.add("김블루");
        strset.add("김그린");
        strset.remove("김블루");
        System.out.println(strset);
        strset.add("원빈");
        strset.add("공유");
        System.out.println(strset);
        Iterator<String> iter = strset.iterator();
        //hasNaxt() next()
        while (iter.hasNext()){
            String s = iter.next();
            System.out.println(s);
        }
        for (String str:
             strset) {
            System.out.println(str);
        }
    }
}
