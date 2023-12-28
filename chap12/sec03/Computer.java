package chap12.sec03;

public class Computer {
    //정적메소드
    public static double staticMethod(double x, double y){
        return  x+y;
    }
    //인스턴스메소드
    public double instanceMethod(double x, double y){
        return x*y;
    }
}
