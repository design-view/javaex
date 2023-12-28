package Stream.sec01;

import java.io.*;

public class AssistantStringExam {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("E:/files/text1.txt");
        Reader rd = new InputStreamReader(is);

        char[] carr = new char[3];
        while(true){
            int num = rd.read(carr);
            if(num==-1) break;
            for (int i = 0; i < num; i++) {
                System.out.print(carr[i]);
            }
            System.out.println();
        }
        rd.close();
        is.close();
    }
}
