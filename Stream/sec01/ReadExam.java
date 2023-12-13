package Stream.sec01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExam {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("C:/temp/test1.db");
        while(true){
            int date = is.read();  //1바이트식 읽기
            if(date == -1){  //파일 끝에 도달했을 경우
                break;
            }
            System.out.println(date);
        }
        is.close(); //인풋스트림을 사용하지 않겠다
        InputStream is2 = new FileInputStream("C:temp/test2.db");
        byte[] buffer = new byte[100];  //길이 100인 배열 생성
        while(true){
            int readByteNum = is2.read(buffer);  //배열 길이만큼 읽기
            if(readByteNum == -1) {
                break;
            }
            for(int i=0; i<readByteNum; i++){
                System.out.println(buffer[i]);
            }
        }
    }
}
