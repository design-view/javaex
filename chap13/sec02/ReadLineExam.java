package chap13.sec02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineExam {
    public static void main(String[] args) throws IOException {
        BufferedReader bre =
                new BufferedReader(new FileReader("src/chap13/sec02/BufferExam.java"));
        while(true){
            String str = bre.readLine();
            if(str == null) break;
            System.out.println(str);
        }
        bre.close();
    }
}
