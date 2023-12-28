package chap10.sec01;

import java.awt.*;

public class BeepPrintExam {
    public static void main(String[] args) {

        Thread cThread = Thread.currentThread();
        System.out.println(cThread.getName());
        Thread beepThread = new BeepTask();
        beepThread.start();
        Thread myThread = new Thread(new MyRunnable());
        myThread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("땡");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
