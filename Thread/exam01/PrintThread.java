package Thread.exam01;

public class PrintThread extends Thread {
    private boolean stop;

    public boolean isStop(boolean stop) {
        this.stop = stop;
        return stop;
    }

    @Override
    public void run() {
       while(!stop){
           System.out.println("실행중");
       }
       System.out.println("자원 정리");
       System.out.println("실행 종료");
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
}
