package chap11.sec01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam {
    public static void main(String[] args) {
        //List 인터페이스
        List<String> list = new ArrayList<>();
        list.add("김그린");
        list.add("홍길동");
        list.add("김블루");
        list.add(1,"박기정");
        list.remove(1);

        //리스트를 배열로 리턴
        String[] strArr = list.toArray(new String[list.size()]);
        System.out.println(list.contains("김그린"));
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        List<Integer> numlist = new ArrayList<>();
        numlist.add(1);
        numlist.add(2);
        numlist.add(3);
        numlist.add(4);
        numlist.add(5);
        numlist.set(0,100);
        System.out.println(numlist);
        numlist.clear();
        System.out.println(numlist.isEmpty());


    }
}
