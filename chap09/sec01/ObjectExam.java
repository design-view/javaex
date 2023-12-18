package chap09.sec01;

import java.util.Arrays;

public class ObjectExam {
    public static void main(String[] args) {
        int[] numarr = {10,20,30};
        String str = "aaa";
        Object obj1 = new Object();
        System.out.println(obj1.toString());

        Person per1 = new Person("김철수",20);
        Person per2 = new Person("김철수",20);
        System.out.println(per1.toString());
        System.out.println(per2.toString());

        System.out.println(per1.equals(per2));  //false
        System.out.println(per1 == per2);       //false
    }
}
