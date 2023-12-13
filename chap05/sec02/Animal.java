package chap05.sec02;

public class Animal {
    //필드
    String name;
    int age;
    //생성자
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    //메소드
    void sound(){
        System.out.println("소리를 냅니다.");
    }
}
