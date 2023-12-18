package chap07.sec04;

public class MethodReferenceExam {
    public static void main(String[] args) {
        Person person = new Person();

        person.action((x,y)->{return x+y;});
        //정적메소드 참조람다
        person.action(Computer::staticMethod);

        //인스턴스 메소드 참조형람다
        Computer computer = new Computer();
        person.action(computer::instanceMethod);

        person.action((x,y)->x-y);
        person.action((x,y)->x*y);
        person.action(Math::max);
    }


}
