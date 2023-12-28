package Stream.sec01;

import java.io.*;

public class AssistantStreamExam {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("E:/files/text1.txt");
        //바이트 스트림에 문자를 입력하도록 보조 스트림 넣기
        Writer osw = new OutputStreamWriter(os);
        osw.write("안녕하세요");
        osw.write("랄랄랄라라랄");
        osw.flush();
        osw.close();
    }
}
