package chap10.sec03;

public class PrintThread extends Thread{
    @Override
    public void run() {
          //  try {

            //} //catch (InterruptedException e) {

            //}
            while (true) {
                if(Thread.interrupted()){
                    break;
                }
                System.out.println("실행중");
                // Thread.sleep(100);

            }
        System.out.println("자원정리");
        System.out.println("실행종료");
        }

}
