package chap10.sec03;

public class InterruptedExam {
    public static void main(String[] args) {
        Thread th = new PrintThread();
        th.start(); //실행대기상태
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        th.interrupt();   // th스레드가 일시정지 상태가 되었을때
        //InterruptedException을 발생 시킴
    }
}
