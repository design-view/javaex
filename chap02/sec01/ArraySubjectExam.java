package chap02.sec01;

import java.util.Scanner;

public class ArraySubjectExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //과목을 입력받아서 배열에추가
        //종료가 입력되면 그만입력받고 배열항목을 출력
        String[] sub = new String[0];
        String inputSubject = "";
        while(true){
            System.out.print("추가할 과목을 입력 : ");
            inputSubject = scan.nextLine();
            if(inputSubject.equals("종료")){
                break;
            }else {
                String[] sub2 = new String[sub.length+1];
                for (int i = 0; i < sub.length; i++) {
                    sub2[i] = sub[i];
                }
                sub2[sub2.length-1] = inputSubject;
                sub = sub2;
            }
        }
        for (int i = 0; i < sub.length; i++) {
            System.out.println("추가한" + (i+1)+"번째과목 : " + sub[i]);
        }
    }
}
