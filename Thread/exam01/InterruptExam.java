package Thread.exam01;

public class InterruptExam {
    public static void main(String[] args) {
        Thread th = new PrintThread3();
        th.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        th.interrupt();
    }

}
