package chap06.sec01;

public class MyClassExam {
    public static void main(String[] args) {
        MyClass myClass1 = new MyClass();
        myClass1.rc.turnOn();
        myClass1.rc.turnOff();
        RemoteControl rc = new Television();
        MyClass myClass2 = new MyClass(new Audio());
        myClass2.method2(new Television());
    }
}
