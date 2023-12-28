package chap10.sec01;

public class ThreadExam {
    public static void main(String[] args) {
        //myThread1 --->  Thread클래스의 자식 클래스 MyForThread
        //0.5씩 쉬면서 "+" 10번 출력
        //myThread2 --->  Runnable인터페이스 구현 클래스 MyForRunnable
        //0.5씩 쉬면서 "%" 10번출력
        Thread myThread1 = new MyForThread();
        Thread myThread2 = new Thread(new MyForRunnable());
        myThread1.start();
        myThread2.start();
    }
}
