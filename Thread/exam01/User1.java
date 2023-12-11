package Thread.exam01;

public class User1 extends  Thread {
    private  Calculator calculator;

    public void setCalculator(Calculator calculator) {
        this.setName("User1"); //쓰레드 이름 User1로 설정
        this.calculator = calculator;
    }

    @Override
    public void run() {
       calculator.setMemory(100);
    }
}
