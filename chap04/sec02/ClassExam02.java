package chap04.sec02;

public class ClassExam02 {
    public static void main(String[] args) {
        Person per = new Person("영희",22);
        System.out.println(per.getName());
        System.out.println(per.getAge());
        Member m1 = new Member("그린",20);
        per.setAge(-100);
        System.out.println(per.getAge());
    }
}
