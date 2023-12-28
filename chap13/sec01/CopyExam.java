package chap13.sec01;

import java.io.*;

public class CopyExam {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("C:/Temp/dog1.jpg");
        OutputStream out = new FileOutputStream("C:/Temp/dog2.jpg");
        byte[] inbyte = new byte[1024];
        while(true){
            int num = in.read(inbyte);
            if(num == -1) break;
            out.write(inbyte,0,num);
        }
        out.flush();
        out.close();
        in.close();
    }
}
