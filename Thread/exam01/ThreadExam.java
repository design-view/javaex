package Thread.exam01;

public class ThreadExam {
    public static void main(String[] args) {
        Thread th = new MyThread();
        th.start();
        Thread th2 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.print("~~");
                }
            }
        };
        Thread th3 = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.print("$$");
            }
        });
        th2.start();
        th3.start();
        for (int i = 0; i < 200; i++) {
            System.out.print("*@*");
        }
    }
}
