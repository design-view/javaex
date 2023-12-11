package chap04.sec01;

public class Animal {
    String kind = "동물";
    String name;
    int age;

    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    void sound(){
        System.out.println("소리냅니다.");
    }
    void eat(){
        System.out.println("밥을 먹습니다.");
    }
}

