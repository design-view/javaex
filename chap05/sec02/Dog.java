package chap05.sec02;

public class Dog extends Animal{
    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    void sound() {
        System.out.println("멍멍");
    }
    void run() {
        System.out.println("달린다");
    }
}
