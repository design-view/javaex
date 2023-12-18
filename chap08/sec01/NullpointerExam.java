package chap08.sec01;

public class NullpointerExam {
    public static void main(String[] args) {
        String str = null;
        //예외가 발생되면 프로그램이 종료
        str.indexOf("a");
        System.out.println("안녕하세요");
    }
}
