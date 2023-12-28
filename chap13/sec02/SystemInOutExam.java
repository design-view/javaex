package chap13.sec02;

import java.io.*;

public class SystemInOutExam {
    public static void main(String[] args) throws IOException {
        System.out.print("입력하세요 : ");
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);
        BufferedReader breader = new BufferedReader(reader);
        //라인단위로 문자열을 읽음
        String inputstr = breader.readLine();
        System.out.println(inputstr);
    }
}
