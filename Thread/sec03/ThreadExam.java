package Thread.sec03;

public class ThreadExam {
    public static void main(String[] args) {
        Thread th = new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    if(Thread.interrupted()){
                        System.out.println("작업스레드종료");
                        break;
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(i);
                }
            }
        };
        th.setName("작업스레드1");
        th.start();
        Thread th2 = new Thread(){
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(i);
                }
            }
        };
        th2.start();
        th.interrupt();
        System.out.println("메인 스레드가 실행중입니다.");
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+ "가 실행" +i);
        }
    }
}
