package chap02;

import java.util.Calendar;

public class EunmWeekExam {
    public static void main(String[] args) {
        Week today = null;
        //현재날짜와 시간객체
        Calendar cal = Calendar.getInstance();
        int week = cal.get(Calendar.DAY_OF_WEEK);
        switch (week){
            case 1:
                today = Week.SUNDAY; break;
            case 2:
                today = Week.MONDAY; break;
            case 3:
                today = Week.TUESDAY; break;
            case 4:
                today = Week.WEDNESDAY; break;
            case 5:
                today = Week.THURSDAY; break;
            case 6:
                today = Week.FRIDAY; break;
            case 7:
                today = Week.SATURDAY; break;
        }


        System.out.println("오늘 요일 : " +today);
    }
}
