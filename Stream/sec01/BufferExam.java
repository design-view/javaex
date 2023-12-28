package Stream.sec01;


import java.io.*;

public class BufferExam {
    private static OutputStream os;

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("C:/Temp/dog1.jpg");
        OutputStream os = new FileOutputStream("C:/Temp/dog4.jpg");

        InputStream is2 = new FileInputStream("C:/Temp/dog2.jpg");
        OutputStream os2 = new FileOutputStream("C:/Temp/dog5.jpg");
        BufferedOutputStream bos = new BufferedOutputStream(os2);
        BufferedInputStream bis = new BufferedInputStream(is2);

        //버퍼를 사용하지 않고 복사
        long nonbufferTime =  copy(is,os);
        System.out.println("버퍼 미사용 : " + nonbufferTime);
        //버퍼를 사요하고 복사
        long bufferTime = copy(bis, bos);
        System.out.println("버퍼 사용 : " + bufferTime);
        bos.flush();
        bos.close();
        bis.close();
        is.close();
        os.close();

    }
    public static long copy(InputStream is, OutputStream os) throws IOException {
        //시작 시간 설정
        long start = System.nanoTime();
        while(true){
            int data = is.read();
            os.write(data);
            if(data == -1) break;
        }
        os.flush();
        os.close();
        is.close();
        long end = System.nanoTime();
        return end - start;
    }
}
