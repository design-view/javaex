package chap05.sec03;

public class SmartPhone extends Phone{
    public SmartPhone(String owner){
        super(owner);
    }

    @Override
    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }



}
