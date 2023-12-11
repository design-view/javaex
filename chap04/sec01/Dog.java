package chap04.sec01;

public class Dog extends Animal{
    Dog(String name, int age){
        super(name, age);
        //this() 내자신의 다른 생성자 호출
        //부모 클래스의 생성자 호출!!!!! super()
        //super(name, age);
    }

    @Override
    void sound() {
        super.sound();
        System.out.println("멍멍");
    }
}
