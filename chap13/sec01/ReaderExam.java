package chap13.sec01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExam {
    public static void main(String[] args) throws IOException {
        Reader fileread = new FileReader("C:/Temp/text_ex2.txt");
        char[] charr = new char[3];
        while(true){
            int num = fileread.read(charr);
            for (int i = 0; i < num; i++) {
                System.out.print(charr[i]);
            }
            if(num == -1) break;
            System.out.println();
        }
        fileread.close();
    }
}
