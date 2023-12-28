package chap13.sec02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExam {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps =
                new PrintStream(new FileOutputStream("C:/Temp/printstream.txt"));
        ps.println("안녕하세요");
        ps.println("프린트가 출력하는것 처럼");
        ps.println("데이터를 출력합니다.");
        ps.flush();
        ps.close();
    }
}
