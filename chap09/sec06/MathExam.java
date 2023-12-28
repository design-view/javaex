package chap09.sec06;

public class MathExam {
    public static void main(String[] args) {
        //Math.abs() 절대값 리턴
        int v1 = Math.abs(-5);
        System.out.println(v1);
        double d1 = Math.abs(-3.145);
        System.out.println(d1);

        //Math.floor(5.3) 내림
        double d2 = Math.floor(5.3);
        System.out.println(d2);

        //Math.ceil(5.3) 올림
        double d3 = Math.ceil(5.3);
        System.out.println(d3);

        //Math.round(5.3) 반올림
        long d4 = Math.round(5.3);
        System.out.println(d4);

        //Math.max(x, y)  x,y중 큰수 리턴
        int v5 = Math.max(10,20);    //20
        System.out.println(v5);
        double d5 = Math.max(2.456,7.56);

        //Math.min(x,y)  x,y중 작은수 리턴
        int v6 = Math.min(20,5);   //5

        //Math.random()   0~1보다 작은 실수 리턴
        double d6 = Math.random();
        System.out.println(d6);

        double d7 = Math.rint(5.3);
        double d8 = Math.rint(5.8);
        System.out.println("rint는 가까운 정수의 실수값을 리턴 : "+d7);
        System.out.println("rint는 가까운 정수의 실수값을 리턴 : "+d8);

    }
}
