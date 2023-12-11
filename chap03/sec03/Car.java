package chap03.sec03;

public class Car {
    //정적 car1필드
    private static Car car1 = new Car();

    //외부접근금지
    //외부클래스에서 생성자 호출할수 없음
    private Car(){}

    static Car getInstance(){
        return  car1;
    }

}
