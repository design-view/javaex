package chap13.sec01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExam {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("C:/Temp/text_ex1.txt");
        byte[] readb = new byte[5];
        //read()   읽은 바이트수 리턴
        //읽을게 없으면 -1을 리턴
        while(true){
            int num = is.read(readb);
            for (int i = 0; i < num; i++) {
                System.out.print(readb[i]+",");
            }
            System.out.println();
            if(num == -1) break;
        }
        is.close();
    }
}
