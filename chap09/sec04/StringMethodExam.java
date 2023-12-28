package chap09.sec04;

public class StringMethodExam {
    public static void main(String[] args) {
        //문자추출 charAt(idx)  ---> char타입 리턴
        //문자열길이 length()  ---> int타입 리턴
        String str = "green computer";
        char charstr = str.charAt(2);
        System.out.println(charstr);

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
        //문자열 비교 equals()
        String str1= "김그린";
        String str2 = "김그린";
        String str3 = new String("김그린");

        if(str1==str2){
            System.out.println("str1과 str2는 번지가 같다");
        }
        if(str1!=str3){
            System.out.println("str1과 str3는 번지가 다르다");
        }
        if(str1.equals(str2)){
            System.out.println("str1과 str2는 값이 같다");
        }
        if(str1.equals(str3)){
            System.out.println("str1과 str는 값이 같다");
        }

        //문자열 찾기 indexOf("문자열") --> index리턴 없으면 -1리턴
        //contains("문자열")  ---> 있으면 true 없으면 false리턴
        String str4 = "그린컴퓨터아카데미";
        System.out.println(str4.indexOf("컴"));
        System.out.println(str4.contains("나"));

        //문자열 잘라내기 substring(start, end) end포함X
        String str5 = str4.substring(2,5);// 컴퓨터
        System.out.println(str5);
        String str6 = str4.substring(2); //컴~마지막까지
        System.out.println(str6);

        //문자열 변경 replace("문자","변경문자")
        String str7 = str4.replace("그린","블루");
        System.out.println(str7);
        //대소문자 변경 toLowerCase(), toUpperCase()
        String str8 = "GreenComputer";
        String str9 = str8.toLowerCase();
        String str10 = str8.toUpperCase();
        System.out.println(str9);
        System.out.println(str10);
    }
}
