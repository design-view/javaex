package chap11.sec01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListintExam {
    public static void main(String[] args) {
        List<Integer> numlist = new ArrayList<>();
        numlist.add(10);
        numlist.add(2);
        numlist.add(6);
        numlist.add(1);
        numlist.add(7);

        //Integer[] arr =  numlist.toArray(new Integer[numlist.size()]);
        int[] arr = new int[numlist.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = numlist.get(i);
        }

        System.out.println(numlist);
        //리스트 정렬
        //list.sort() 정렬 하기
        //Comparator.naturalOrder() 오름차순
        //Comparator.reverseOrder() 내림차순
        numlist.sort(Comparator.reverseOrder());
        System.out.println(numlist);

        List<String> strlist = new ArrayList<>();
        strlist.add("B");
        strlist.add("C");
        strlist.add("z");
        strlist.add("a");
        strlist.add("A");
        System.out.println("원본 : " + strlist);
        strlist.sort(Comparator.naturalOrder());
        System.out.println("오름차순 정렬 : " + strlist);
        strlist.sort(Comparator.reverseOrder());
        System.out.println("내림차순 정렬 : " + strlist);
        //대소문자 구분없이 오름차순정렬
        //String.CAST_INSENSITIVE_ORDER
        //대소문자 구분없이 내림차순정렬
        //Comparator.reverseOrder(String.CAST_INSENSITIVE_ORDER)
        strlist.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("대소문자 구분없이 오름차순 : " + strlist);
        strlist.sort(Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        System.out.println("대소문자 구분없이 내림차순 : " + strlist);

        List<String> strlist2 = new ArrayList<>();
        strlist2.add("z");
        strlist2.add("a");
        strlist2.add("B");
        strlist2.add("g");
        strlist2.add("A");
        System.out.println("원본리스트: "+strlist2);
        //오름차순 정렬
        Collections.sort(strlist2);
        System.out.println("오름차순 정렬 : " + strlist2);
        //내림차순 정렬
        Collections.sort(strlist2, Collections.reverseOrder());
        System.out.println("내림차순 정렬 : " + strlist2);
        //대소문자 구분없이 오름차순 정렬
        Collections.sort(strlist2, String.CASE_INSENSITIVE_ORDER);
        System.out.println("대소문자 구분없이 오름차순 정렬 : " + strlist2);
        //대소문자 구분없이 내림차순 정렬
        Collections.sort(strlist2, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
        System.out.println("대소문자 구분없이 내림차순 정렬 : " + strlist2);

        List<String> strlist3 = new ArrayList<String>();
        strlist3.add("z");
        strlist3.add("a");
        strlist3.add("B");
        strlist3.add("g");
        strlist3.add("A");
        Collections.reverse(strlist3);
        System.out.println(strlist3);
    }
}
