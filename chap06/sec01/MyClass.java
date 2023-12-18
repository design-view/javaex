package chap06.sec01;

public class MyClass {
    //필드
    RemoteControl rc = new Television();
    //생성자
    MyClass(){

    }
    MyClass(RemoteControl rc){
        this.rc = rc;
        rc.turnOn();
        rc.setVolume(5);
    }
    //메소드
    void method1(){
        RemoteControl rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
    }
    void method2(RemoteControl rc){
        rc.turnOn();
        rc.turnOff();

    }
}
