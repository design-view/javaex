package chap11.sec03;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
    public static void main(String[] args) {
        Set<String> strset = new HashSet<String>();
        strset.add("그린");
        strset.add("블루");
        strset.add("그린");
        strset.add("오렌지");
        System.out.println(strset);
        //반복자  hasNext(), next()
        Iterator<String> siter =  strset.iterator();
        while(siter.hasNext()){
            String str = siter.next();
            System.out.println(str);
        }

        boolean isstr = strset.contains("레드");
        strset.remove("그린");
        System.out.println(strset);
        System.out.println(isstr);
        //set에 있는 모든 객체 제거
        strset.clear();
        //isEmpty() 비어 있는지 체크
        boolean isem = strset.isEmpty();
        System.out.println(isem);

        Set<Animal> aniset = new HashSet<Animal>();
        aniset.add(new Animal("레오",3));
        aniset.add(new Animal("흰둥이",4));
        aniset.add(new Animal("까망이",2));
        aniset.add(new Animal("까망이",2));
        System.out.println(aniset.size());

    }
}
