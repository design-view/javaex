package Stream.sec01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExam02 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("c:/temp/test2.db");
        byte[] byArr = new byte[8];
        //인풋스트립으로 부터 3바이트씩 읽어서 byArr배열의 2번째 인덱스 부터 넣어라
        //읽어온 갯수
        int readByteNum = is.read(byArr, 2, 6);
        System.out.println("readByteNum은 : " + readByteNum);
        if(readByteNum != -1){
            for(int i=0; i<byArr.length; i++){
                System.out.println(byArr[i]);
            }
        }
        is.close();
    }
}
