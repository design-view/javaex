package chap04.sec02;

public class Person {
    //필드
    private String name;
    private int age;
    //생성자
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //메소드
    public void eat(){
        System.out.println("먹는다");
    }
    public static void sound(){
        System.out.println("소리를 낸다");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if(age < 0){
            this.age = 0;
        }else {
            this.age = age;
        }
    }
}
