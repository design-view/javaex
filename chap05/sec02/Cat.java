package chap05.sec02;

public class Cat extends Animal{
    String color = "흰색";
    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    void sound() {
        System.out.println("냐옹");
    }
}
