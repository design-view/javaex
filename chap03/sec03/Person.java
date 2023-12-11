package chap03.sec03;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //getter
    int getAge(){
        return this.age;
    }
    String getName(){
        return this.name;
    }
    void setAge(int age){
        this.age = age;
    }
    void setName(String name){
        this.name = name;
    }
}
