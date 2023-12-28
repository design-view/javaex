package Stream.sec01;

import java.io.*;

public class ReadLineExam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/Stream/sec01/BufferExam.java"));
        int lineno = 1;
        while(true) {
            String str = br.readLine();
            if(str == null) break;
            System.out.println(lineno + "\t" + str);
            lineno++;
        }
        br.close();


    }
}
