package chap13.sec02;

import java.io.*;
import java.util.Scanner;

public class CharacterConvertStreamExam {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("파일에 적을 내용을 입력하세요 : ");
        String str = sc.nextLine();
        write(str);
        System.out.println("================================");
        String str2 = read();
        System.out.println("파일에 입력된 내용은 : " + str2);
    }
    public static void write(String str) throws IOException {
        //출력스트림 객체 생성
        OutputStream os = new FileOutputStream("C:/Temp/text5.txt");
        //보조스트림 생성
        Writer wr = new OutputStreamWriter(os,"UTF-8");
        wr.write(str);
        wr.flush();
        wr.close();
        os.close();
    }
    public static String read() throws IOException {
        //입력스트립 객체 생성
        InputStream is = new FileInputStream("C:Temp/text5.txt");
        Reader rd = new InputStreamReader(is);
        char[] charr = new char[100];
        int num = rd.read(charr);
        rd.close();
        String str = new String(charr,0,num);
        return str;
    }
}
