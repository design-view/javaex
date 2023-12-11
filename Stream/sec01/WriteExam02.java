package Stream.sec01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExam02 {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("C://temp/test2.db");
        byte[] byarray = {10,20,30,40,50,60};

        os.write(byarray,2,3);
        os.flush();
        os.close();
    }
}
