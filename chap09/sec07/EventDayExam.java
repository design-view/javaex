package chap09.sec07;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class EventDayExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("기념일을 알려드립니다.");
        System.out.println("========================================");
        System.out.print("년도를 입력하세요");
        int yearinput = scan.nextInt();
        System.out.print("월를 입력하세요");
        int monthinput = scan.nextInt();
        System.out.print("일을 입력하세요");
        int dayinput = scan.nextInt();
        System.out.println(yearinput+"년"+monthinput+"월"+dayinput+"일");
        //입력 받은 날짜대로 LocalDateTime객체
        //현재 날짜 LocalDateTime객체
        LocalDateTime nowDate = LocalDateTime.now();
        LocalDateTime eventDate = LocalDateTime.of(yearinput,monthinput,dayinput,0,0,0);
        //50일은 2023년 12월 10일 이다.
        //100일은 2023년 12월 10일 이다.
        //현째까지 500일 만났습니다.
        LocalDateTime event50 = eventDate.plusDays(50);
        LocalDateTime event100 = eventDate.plusDays(100);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년MM월dd일");
        long remainDay = eventDate.until(nowDate, ChronoUnit.DAYS);
        System.out.println("50일은 "+event50.format(dtf)+" 이다.");
        System.out.println("100일은 "+event100.format(dtf)+" 이다.");
        System.out.println("현재까지 "+remainDay+"일 만났습니다.");
    }
}
