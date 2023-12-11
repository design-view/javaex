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
    }
}
