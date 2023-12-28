package chap13.sec02;

import java.io.*;

public class BufferExam {
    public static void main(String[] args) throws IOException {
        //입출력 스트림 생성
        FileInputStream fis = new FileInputStream("C:/Temp/dog1.jpg");
        FileOutputStream fos = new FileOutputStream("C:/Temp/dog3.jpg");

        //입출력 + 버퍼 스트림 생성
        FileInputStream fis2 = new FileInputStream("C:/Temp/dog2.jpg");
        FileOutputStream fos2 = new FileOutputStream("C:/Temp/dog4.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        //버퍼를 사용하지 않고 복사
        long nonbufferTime = copy(fis,fos);
        System.out.println("버퍼 미사용 : " + nonbufferTime);
        //버퍼를 사용하고 복사
        long bufferTime = copy(bis, bos);
        System.out.println("버퍼 사용 : " + bufferTime);
    }
    public static long copy(InputStream is, OutputStream os) throws IOException {
        //시작시간
        long start = System.nanoTime();
        while(true){
            int data = is.read();
            if(data == -1) break;
            os.write(data);
        }
        os.flush();
        os.close();
        is.close();
        //종료시간
        long end = System.nanoTime();
        return end-start;
    }
}
