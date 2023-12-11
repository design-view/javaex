package chap04.sec01;

public class CellPhone {
    String model;
    String color;
    CellPhone(){
        System.out.println("부모 생성자 호출");
    }
    void powerOn(){
        System.out.println("전원을 켭니다.");
    }
    void powerOff(){
        System.out.println("전원을 끕니다.");
    }
    void bell(){
        System.out.println("벨이 울립니다.");
    }
}
