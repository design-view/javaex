package chap09.sec07;

import java.util.Calendar;

public class CalendarExam {
    public static void main(String[] args) {
        //Calendar는 추상 클래스이다.
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);      //년도
        int month = now.get(Calendar.MONTH)+1;  //월
        int day = now.get(Calendar.DAY_OF_MONTH);//일
        System.out.println("오늘은 "+year + "년 "
                +month + "월" + day+"일 이다.");
        int week = now.get(Calendar.DAY_OF_WEEK);  //요일
        int amPm = now.get(Calendar.AM_PM);   //오전오후
        int hour = now.get(Calendar.HOUR);   //시간
        int minute = now.get(Calendar.MINUTE); //분
        int second = now.get(Calendar.SECOND); //초
        String strWeek = "";
        String ampm = "";
        if(amPm == Calendar.AM) {
            ampm = "오전";
        }else {
            ampm = "오후";
        }
        switch (week){
            case Calendar.MONDAY:
                strWeek = "월";
                break;
            case Calendar.TUESDAY:
                strWeek = "화";
                break;
            case Calendar.WEDNESDAY:
                strWeek = "수";
                break;
            case Calendar.THURSDAY:
                strWeek = "목";
                break;
            case Calendar.FRIDAY:
                strWeek = "금";
                break;
            case Calendar.SATURDAY:
                strWeek = "토";
                break;
            case Calendar.SUNDAY:
                strWeek = "일";
                break;
        }
        System.out.println("오늘은 "+strWeek+"요일 입니다.");
        System.out.println(ampm + " 입니다.");
    }
}
