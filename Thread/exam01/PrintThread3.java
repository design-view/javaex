package Thread.exam01;

public class PrintThread3 extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("실행중");
            if(Thread.interrupted()){
                break;
            }
        }
        System.out.println("자원정리");
        System.out.println("실행종료");
    }
}
