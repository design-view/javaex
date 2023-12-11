package Thread.exam01;

public class RunnableExam {
    public static void main(String[] args) {
        Thread th= new Thread(() -> {
                for(int i=0; i<100; i++) {
                    System.out.print("하");
                }
        });
        Thread nowThread = Thread.currentThread();
        String threadname = nowThread.getName();
        System.out.println(threadname);
        String threadname2 = th.getName();
        System.out.println(threadname2);
        th.start();
        for(int i=0; i<100; i++){
            System.out.print("크");
        }
    }
}
