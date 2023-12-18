package chap07.sec02;

public class AnonymousExam {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();
        //익명객체 필드 사용
        anony.field.wake();
        anony.method();
    }
}
