package Thread.exam01;

public class MainThreadExam {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        User1 user1 = new User1();
        user1.setCalculator(calculator);
        user1.start(); //user1쓰레드 시작

        User2 user2 = new User2();
        user2.setCalculator(calculator);
        user2.start(); //user2쓰레드 시작

    }
}
