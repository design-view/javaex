package chap11.sec02;

import java.util.Objects;

public class Member implements Comparable<Member> {
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
       if(o instanceof Member){
           Member m = (Member) o;
           return name.equals(m.getName()) && age==m.getAge();
       }
       return false;
    }

    @Override
    public int hashCode() {
        return (name+age).hashCode();
    }

    @Override
    public int compareTo(Member o) {
        if(age < o.getAge()){
            return -1;
        }else if(age == o.getAge()){
            return 0;
        }else {
            return 1;
        }

    }
}
