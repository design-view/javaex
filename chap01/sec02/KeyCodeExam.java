package chap01.sec02;

import java.io.IOException;

public class KeyCodeExam {
    public static void main(String[] args) throws IOException {
        int keyCode;
        //일반예외가 발생할수 있는코드
        //예외처리 코드를 작성해야함
        while (true) {
            keyCode = System.in.read();
            System.out.println("keyCode : " + keyCode);
            if(keyCode == 113){
                break;
            }
        }
    }
}
