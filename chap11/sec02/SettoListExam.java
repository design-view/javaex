package chap11.sec02;

import java.util.*;

public class SettoListExam {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");

        //set -> list
        List<String> list = new ArrayList<>(set);
        System.out.println(list);

        List<String> list2 = new ArrayList<>();
        list2.addAll(set);
        System.out.println(list2);

        //set --> 배열
        String[] strArray = set.toArray(new String[set.size()]);
        System.out.println(Arrays.toString(strArray));
    }
}
