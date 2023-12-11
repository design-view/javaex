package Thread.exam01;

public class StopFlagExam {
    public static void main(String[] args) {
        PrintThread pt = new PrintThread();
        pt.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        pt.setStop(true);
    }


}
