package chap09.sec04;

public class BytetoStringExam {
    public static void main(String[] args) {
        //바이트 배열을 문자열로
        //키코드 번호
        byte[] bytearr = {72,101,108,108,111,32,74,97,118,97};
        String str = new String(bytearr);
        System.out.println(str);

        String str2 = new String(bytearr, 6, 4);
        System.out.println(str2);

        String str3 = "green";
        String str4 = new String("김그린");

    }
}
