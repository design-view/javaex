package chap05.sec03;

//추상클래스 abstract
public abstract class Animal {
    public String kind;

    public void breathe(){
        System.out.println("숨을 쉽니다.");
    }
    //추상메소드는 추상클래스안에서만 작성가능
    public abstract void sound();
}
