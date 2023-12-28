package chap09.sec07;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExam {
    public static void main(String[] args) {
        //현재날짜 시간 객체
        LocalDateTime nowDateTime = LocalDateTime.now();
        LocalDateTime startDateTime = LocalDateTime.of(2022,12,5,0,0,0);
        LocalDateTime endDateTime = LocalDateTime.of(2023,12,4,0,0,0);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("시작일 : " + startDateTime.format(dtf));
        System.out.println("종료일 : " + endDateTime.format(dtf));
        LocalDateTime result = startDateTime.plusDays(10);
        System.out.println("시작일로 부터 10일 후 : " + result.format(dtf));
        if(startDateTime.isBefore(endDateTime)){
            System.out.println("진행중입니다.");
        }else if(startDateTime.isEqual(endDateTime)){
            System.out.println("종료합니다.");
        }else if(startDateTime.isAfter(endDateTime)) {
            System.out.println("종료했습니다.");
        }
        long remainYear = startDateTime.until(nowDateTime, ChronoUnit.YEARS);
        long remainMonth = startDateTime.until(nowDateTime, ChronoUnit.MONTHS);
        long remainDay = startDateTime.until(nowDateTime, ChronoUnit.DAYS);
        System.out.println("지나온 해 : " + remainYear);
        System.out.println("지나온 달 : " + remainMonth);
        System.out.println("지나온 일 : " + remainDay);
    }

}
