package chap13.sec02;



import java.io.*;
import java.util.Arrays;

public class ObjectOutputExam {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream("C:/Temp/object.txt"));

        //객체 생성
        Member m1 = new Member("green","김그린");
        int[] arr = {1,2,3,4,5};

        oos.writeObject(m1);
        oos.writeObject(arr);

        oos.flush();
        oos.close();

        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("C:/Temp/object.txt"));

        //파일을 읽고 역직렬화해서 객체로 복원
        Member m2 = (Member) ois.readObject();
        int[] arr2 = (int[]) ois.readObject();

        ois.close();
        System.out.println(m2);
        System.out.println(Arrays.toString(arr2));

    }
}
