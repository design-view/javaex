package chap05.sec03;

//추상클래스 abstract
public abstract class Phone {
    //필드
    public String owner;
    //생성자
    public Phone(String owner){
        this.owner = owner;
    }
    //메소드
    //추상메소드 abstract
    //{ 실행부 제거 }
    public abstract void turnOn();
}
