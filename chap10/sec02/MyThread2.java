package chap10.sec02;

public class MyThread2 extends Thread{
    private Calculator calculator;
    public void setCalculator(Calculator calculator){
        this.setName("MyThread2");
        this.calculator = calculator;
    }

    @Override
    public void run() {
        calculator.setMemory(50);
    }
}
