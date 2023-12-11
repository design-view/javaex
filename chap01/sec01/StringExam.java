package chap01.sec01;

public class StringExam {
    public static void main(String[] args) {
        String str = "100";
        int value1 = Integer.parseInt(str);
        String str2 = "3.14";
        double value2 = Double.parseDouble(str2);
        System.out.println("value1은 : " + (value1+10));
        System.out.println("value2은 : " + value2);
        String str3 = String.valueOf(10);   //문자로 변경
        String str4 = String.valueOf(3.145);
        String str5 = 3.142+"";
        System.out.println(str3);
    }
}
