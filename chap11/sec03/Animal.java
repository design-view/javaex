package chap11.sec03;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    //getter
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    //setter 메소드
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public int hashCode() {
        return (name+age).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Animal){
            Animal ani = (Animal) obj;
            return name.equals(ani.name) && age==ani.age;
        }
        return false;
    }
}
