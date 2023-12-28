package chap13.sec01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamExam {
    public static void main(String[] args) throws Exception {
        //바이트출력스트림
        OutputStream os = new FileOutputStream("C:/Temp/text_ex1.txt");
        byte[] bs= {106,107,108,109,110,111,112,113,114,115,116};
        byte a = 10;
        byte b = 20;
        byte c = 30;
        os.write(a);
        os.write(b);
        os.write(c);
        os.write(bs);
        os.flush();
        os.close();

    }
}
