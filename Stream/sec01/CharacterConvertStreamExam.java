package Stream.sec01;

import java.io.*;

public class CharacterConvertStreamExam {
    public static void main(String[] args) throws IOException {
        write("안녕하세요");
        read();
    }
    public static void write(String str) throws IOException {
        OutputStream os = new FileOutputStream("C:/Temp/text_ex3.txt");
        Writer wr = new OutputStreamWriter(os, "UTF-8");
        wr.write(str);
        wr.flush();
        wr.close();
    }
    public static void read() throws IOException {
        InputStream is = new FileInputStream("C:/Temp/text_ex3.txt");
        Reader rd = new InputStreamReader(is, "UTF-8");
        char[] carr = new char[10];
        while (true){
            int num = rd.read(carr);
            for (int i = 0; i < num; i++) {
                System.out.println(carr[i]);
            }
            if(num == -1) break;
        }
        rd.close();
        is.close();

    }
}
