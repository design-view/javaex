package chap13.sec02;

import java.io.*;

public class DataInputOutputExam {
    public static void main(String[] args) throws IOException {
        //기본타입 출력 보조 스트림
        DataOutputStream dos = 
                new DataOutputStream(new FileOutputStream("C:/Temp/primitive.db"));
        //기본타입출력
        dos.writeUTF("목요일");
        dos.writeDouble(65.45678);
        dos.writeBoolean(false);
        
        dos.writeUTF("자바");
        dos.writeDouble(456.5644879);
        dos.writeBoolean(true);
        
        dos.flush();
        dos.close();
        //기본타입 입력 보조 스트림 
        DataInputStream dis = 
                new DataInputStream(new FileInputStream("C:/Temp/primitive.db"));

        String str = dis.readUTF();
        double b = dis.readDouble();
        boolean bl = dis.readBoolean();

        System.out.println(str + " : " + b + " : "+ bl );
        dis.close();

    }
}
