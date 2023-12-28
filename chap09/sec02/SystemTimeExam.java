package chap09.sec02;

public class SystemTimeExam {
    public static void main(String[] args) {
        long starttime = System.nanoTime();
        //나노초 1/10의 9승  1초  = 1000000000 나노초
        int sum = 0;
        for (int i = 0; i < 10000000; i++) {
            sum += i;
        }
        long endtime = System.nanoTime();
        System.out.println("계산에 "
                + (endtime-starttime) + "나노초가 소요되었습니다.");
    }
}
