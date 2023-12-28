package chap10.sec04;

public class DaemonExam {
    public static void main(String[] args) {
        AutoSaveThread autoSave = new AutoSaveThread();
        autoSave.setDaemon(true);  //데몬스레드 지정
        autoSave.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
        System.out.println("메인 스레도 종료");
    }
}
