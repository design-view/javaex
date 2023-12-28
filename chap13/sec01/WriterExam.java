package chap13.sec01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExam {
    public static void main(String[] args) throws IOException {
        Writer wri = new FileWriter("C:/Temp/text_ex2.txt");
        char a = '가';
        char b = '나';
        wri.write(a);
        wri.write(b);
        char[] carr = {'그','린','컴','퓨','터'};
        wri.write(carr);
        wri.write("안녕");
        wri.flush();
        wri.close();

    }
}
