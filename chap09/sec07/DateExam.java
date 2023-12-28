package chap09.sec07;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateExam {
    public static void main(String[] args) {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String nowStr = sdf.format(now);

        sdf = new SimpleDateFormat("yy.MM.dd a HH:mm:ss");
        String nowStr2 = sdf.format(now);

        sdf = new SimpleDateFormat("올해의 D번째 날");
        String nowStr3 = sdf.format(now);
        System.out.println(now);
        System.out.println(nowStr);
        System.out.println(nowStr2);
        System.out.println(nowStr3);
    }
}
