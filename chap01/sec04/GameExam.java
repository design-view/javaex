package chap01.sec04;

//다른패키지에 있는 클래스는 import해야한다.
import java.util.Scanner;

public class GameExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //컴퓨터에게 랜덤하게 가위, 바위, 보를 지정
        double randomNum = Math.random(); //0~1보다 작은 실수
        String computer = randomNum<0.3333 ? "가위" : randomNum<0.6666 ? "바위" : "보";
        System.out.print("가위, 바위, 보중 하나를 입력하세요 : ");
        String user = scan.nextLine();  //입력받은 값을 문자로 리턴
        System.out.println("컴퓨터 : " + computer);
        System.out.println("나 : " + user);
        //결과 출력
        //무승부, 내가 이기는경우, 컴퓨터가 이기는경우
        if(computer.equals(user)){
            System.out.println("무승부입니다.");
        }else if((user.equals("가위") && computer.equals("보"))
        ||(user.equals("바위") && computer.equals("가위"))
        ||(user.equals("보") && computer.equals("바위"))
        ){
            System.out.println("당신이 이겼습니다.");
        }else {
            System.out.println("당신이 졌습니다.");
        }
    }
}
