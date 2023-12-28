package chap11.sec03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> strlist = new ArrayList<String>();
        strlist.add("화요일");
        strlist.add("김그린");
        strlist.add("홍길동");
        strlist.add("원빈");
        strlist.add("정해인");
        strlist.add(1,"여기에요");
        System.out.println(strlist);
        strlist.remove(3);
        System.out.println(strlist);
        strlist.remove("김그린");
        System.out.println(strlist);
        int idx = strlist.indexOf("a");
        boolean isstr = strlist.contains("정해인");
        System.out.println(idx);
        System.out.println(isstr);
        //리스트를 배열로 변환
        String[] strarr =  strlist.toArray(new String[strlist.size()]);
        System.out.println(Arrays.toString(strarr));
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        int[] arr =  new int[integerList.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = integerList.get(i);
        }
        System.out.println(Arrays.toString(arr));
        //배열 ----> 리스트
        String[] strarr2 = {"a","b","c","d","e"};
        List<String> liststr = new ArrayList<>(Arrays.asList(strarr2));
        System.out.println(liststr);
    }
}
