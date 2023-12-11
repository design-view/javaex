package Thread.exam02;

public class ThreadInterruptExam {
    public static void main(String[] args) {
        Thread th = new Thread(()->{

                   while(true){
                       System.out.println("실행중");
                       if(Thread.interrupted()){
                           break;
                       }
                   }
               System.out.println("자원정리");
               System.out.println("실행종료");
        });
        th.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        th.interrupt();
    }
}
