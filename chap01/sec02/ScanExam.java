package chap01.sec02;

//다른 패키지에 있는 클래스 불러오기
import java.util.Scanner;

public class ScanExam {
    public static void main(String[] args) {
        System.out.print("나이를 입력하세요 : ");
        Scanner scan = new Scanner(System.in);
        //nextLine() ----> 입력한 값을 문자열로 리턴
        //nextInt() ---> 입력한 값을 정수로 리턴
        String str = scan.nextLine();
        System.out.println(str);
        System.out.print("숫자를 입력하세요 : ");
        int num = scan.nextInt();
        if(num % 2 == 1){
            System.out.println("홀수입니다.");
        }else {
            System.out.println("짝수입니다.");
        }
    }
}
