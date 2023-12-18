package chap09.sec01;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "이름은 : "+name+" 이고 나이는 : " + age + "입니다.";
    }

    @Override
    public boolean equals(Object obj) {
        //객체의 필드값이 같으면 true리턴
        //필드값이 다르면 false리턴
        if(obj instanceof  Person){
            Person per = (Person) obj;
            if(per.name.equals(this.name) &&  per.age == this.age){
                return true;
            }
        }
        return false;

    }
}
