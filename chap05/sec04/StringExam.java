package chap05.sec04;

import java.util.Arrays;

public class StringExam {
    public static void main(String[] args) {
        String str1 = "green";
        String str2 = new String("hello");
        byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
        String str3 = new String(bytes);
        System.out.println(str3);
        String str4 = new String(bytes, 6, 4);
        System.out.println(str4);
        //문자 추출
        //charAt(인덱스) 문자열에서 해당하는 인덱스의 문자를 char타입으로 리턴
        String str5 = "green computer";
        char char1 = str5.charAt(1);
        System.out.println(char1);

        //getBytes() 바이트배열로 리턴
        byte[] bytes2 = "blue".getBytes();
        //문자열 찾기 indexOf()
        //문자열에 찾는 문자의 index를 리턴
        int idx = str5.indexOf("z");
        System.out.println("c의 index는 : " + idx);
        //length() 문자열길이 리턴
        System.out.println("문자의 길이는 : " + str5.length());
        //replace("찾는문자","변경할문자") ---> 문자열리턴
        String str6 = str5.replace("green","yellow");
        System.out.println(str6);
        //substring(beginIndex, endIndex) 문자열 잘라내기
        String str7 = str5.substring(8,11);
        System.out.println(str7);
        //toUpperCase(), toLowerCase();
        //대문자로 변경해서 리턴, 소문자로 변경해서 리턴
        //trim() 공백 잘라내기
        String str8 = "   그린 컴퓨터 아카데미       ";
        String str9 = str8.trim();
        System.out.println(str9);
        //문자열 배열로 변경
        //split("")
        String str10 = "green";
        String[] strarr = str10.split("");
        System.out.println(Arrays.toString(strarr));
        //join() 배열을 문자열
        //정적멤버
        String str11 = String.join("***",strarr);
        System.out.println(str11);
    }
}
