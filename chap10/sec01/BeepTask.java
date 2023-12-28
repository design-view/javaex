package chap10.sec01;

import Thread.sec03.ThreadExam;

import java.awt.*;

public class BeepTask extends Thread{
    @Override
    public void run() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Thread beept = Thread.currentThread();
        System.out.println("추가로 생성된 스레드 이름:  " + beept.getName());
        for (int i = 0; i <5 ; i++) {
            toolkit.beep();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
