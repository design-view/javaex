package chap01.sec03;

public class SignOperatorExam {
    public static void main(String[] args) {
        int x = -100;
        int result1 = +x;
        int result2 = -x;

        byte b = 100;
        int result3 = -b;
        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result2 : " + result3);

        //증감 연산자
        int y = 10;
        int z = 10;
        int a;
        //++y 증가시키고 연산
        //y++  연산하고 증가시킴
        z = ++y;   //z -> 11 y-> 11
        z = y++;   //z -> 11 y-> 12
        System.out.println("y=" + y);  //11
        System.out.println("z=" + z);  //11
        boolean play = true;
        play = !play;
        System.out.println(play);
        play = !play;
        System.out.println(play);
    }
}
