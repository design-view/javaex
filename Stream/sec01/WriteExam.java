package Stream.sec01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExam {
    public static void main(String[] args) throws IOException {
        //바이트 기반 출력 스트림 생성
        OutputStream os = new FileOutputStream("c:/temp/test1.db");
        byte a = 10;
        byte b = 20;
        byte c = 30;
        //1바이트 씩 출력
        os.write(a);
        os.write(b);
        os.write(c);
        //출력 버퍼에 잔류하는 모든 바이트를 출력
        os.flush();
        //출력 스트림을 닫음
        os.close();
    }
}
