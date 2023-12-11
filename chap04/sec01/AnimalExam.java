package chap04.sec01;

public class AnimalExam {
    public static void main(String[] args) {
        Cat cat1 = new Cat("레오",3);
        //부모타입으로 자동형변환 되면
        //부모 클래스 메소드만 사용가능
        //부모 클래스의 메소드가 자식 클래스에서
        //재정의된경우는 자식 클래스의 메소드가 적용!!!!!
        Animal ani1 = cat1; //자동형변환
        Dog dog1 = new Dog("콩",5);
        Animal ani2 = dog1; //자동형변환
        cat1.sound();
        ani1.sound();
        cat1.play();

    }
}
