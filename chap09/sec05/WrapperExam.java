package chap09.sec05;

public class WrapperExam {
    public static void main(String[] args) {
        //박싱 : 기본타입의 값을 포장 클래스 변수에 할당할때 일어남
        Integer obj1 = 300;
        Integer obj2 = 300;
        //언박싱 : 포장 클래스 변수를 기본 타입의 변수에 할당할때 일어남
        int num = obj1;
        int num2 = obj1.intValue();   //int값으로 리턴

        //포장 클래스 변수값 비교할때는 equals()메소드로 비교한다.
        //값이 -128~127 비교연산자를 사용해도 됨.
        System.out.println("== : " + (obj1==obj2));
        System.out.println("equals(): " + obj1.equals(obj2));
        //-128~127 범위값일경우
        Integer obj3 = 100;
        Integer obj4 = 100;
        System.out.println("-128~127까지 == : " + (obj3==obj4));
        System.out.println("-128~127까지 equals(): " + obj3.equals(obj4));
    }
}
