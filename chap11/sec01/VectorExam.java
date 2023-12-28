package chap11.sec01;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorExam {
    public static void main(String[] args)  {
        List<Board> listb = new Vector<>();
        //스레드생성
        Thread th1 = new Thread(()->{
            for (int i = 1; i <= 1000; i++) {
                listb.add(new Board("제목"+i,
                        "내용"+i, "글쓴이"+i));
            }
        });
        th1.start();
        Thread th2 = new Thread(()->{
            for (int i = 1001; i <= 2000; i++) {
                listb.add(new Board("제목"+i,
                        "내용"+i, "글쓴이"+i));
            }
        });
        th2.start();
        try {
            //스레드가 실행종료가 될때까지 기다려
            th1.join();
            th2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(listb.size());
    }
}
