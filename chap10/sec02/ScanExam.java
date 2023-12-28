package chap10.sec02;

import java.util.Scanner;

public class ScanExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Thread th = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("싱글스레드");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        th.start();
        System.out.print("아무값이나 입력하세요 : ");

        String str = scan.nextLine();


    }
}
