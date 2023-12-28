package chap10.sec02;

public class MyThread1 extends Thread{
    private Calculator calculator;
    public void setCalculator(Calculator calculator){
        this.setName("MyThread1");
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory(100);
    }
}
