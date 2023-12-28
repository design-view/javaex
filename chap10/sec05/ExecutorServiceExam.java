package chap10.sec05;

import java.util.concurrent.*;

public class ExecutorServiceExam {
    public static void main(String[] args) {
        String[][] mails = new String[1000][3];
        for (int i = 0; i < mails.length; i++) {
            mails[i][0] = "green@my.com";
            mails[i][1] = "member" + i +"@my.com";
            mails[i][2] = "신상품입고";
        }
        //스레드 풀 생성
        //ExecutorService 생성
        //ExecutorService service = Executors.newFixedThreadPool(5);
        //코어스레드 개수
        //최대스레드 개수
        //놀고있는 시간
        //놀고있는 시간 단위
        //작업 큐
        //SynchronousQueue<Runnable>()
        //큐의 크기가 0이므로 즉시 작업자 스레드에 작업을 전달함
        //스레드를 생성하고 이 스레드가 종료될때까지 대기하지 않고 다음
        //작업을 실행하여 스레드 생성 및 종료에 대한 오버헤드를 초래할수 있음


        Object SynchronousQueue;
        ExecutorService service = new ThreadPoolExecutor(6,
                6,
                5,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<>(1000) // 크기가 있는 큐 사용
        );

        //이메일을 보내는 작업 생성 및 처리
        for(int i=0; i<mails.length; i++){
            final int idx = i;
            service.execute(new Runnable()
            //메소드 에서 선언된 중첩 클래스 --> 로컬클래스
            {
                @Override
                public void run() {


                        Thread th = Thread.currentThread();
                        String from = mails[idx][0];
                        String to = mails[idx][1];
                        String content = mails[idx][2];
                        System.out.println("["+th.getName()+"]" + from +"===>" + to + " : " + content);

                }
            });
        }
        service.shutdown();
    }
}
