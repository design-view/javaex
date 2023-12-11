package chap01.sec03;

import java.util.Scanner;

public class SwitchTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int inputNum = scan.nextInt();
        //조건문
        switch (inputNum){
            case 1 :
                System.out.println("첫번째 on");
                break;
            case 2:
                System.out.println("두번째 on");
                break;
            case 3:
                System.out.println("세번째 on");
                break;
            default:
                System.out.println("기본값");
        }
    }
}
