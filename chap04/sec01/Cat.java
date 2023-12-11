package chap04.sec01;

public class Cat extends Animal{
    //부모 클래스의 생성자가 디폴트 생성자가 아닐때
    //super() 명시해야한다(생략할수없음)
    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    void sound() {
        System.out.println("냐옹");
    }
    void play(){
        System.out.println("놀이를 합니다.");
    }
}
