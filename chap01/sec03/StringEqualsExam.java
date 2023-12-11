package chap01.sec03;

public class StringEqualsExam {
    public static void main(String[] args) {
        //클래스타입
        String str = "김그린";
        String str2 = new String("김그린");
        String str3 = new String("김그린");

        boolean result1 = (str2.equals(str3));
        System.out.println(result1);
    }
}
