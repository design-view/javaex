package chap10.sec02;

public class MyThreadExam {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        MyThread1 myThread1 = new MyThread1();
        myThread1.setCalculator(calculator);
        myThread1.start();

        MyThread2 myThread2 = new MyThread2();
        myThread2.setCalculator(calculator);
        myThread2.start();
    }
}
