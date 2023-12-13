package chap05.sec02;

public class AnimalExam {
    public static void main(String[] args) {
        Dog dog1 = new Dog("콩이",4);
        Cat cat1 = new Cat("레오",2);
        Animal ani = dog1;  //자동형변환
        Animal ani3 = cat1;  //자동형변환
        Dog dog2 = (Dog) ani;   //다운캐스팅
        Cat cat2 = (Cat) ani3;  //다운캐스팅
        //부모타입으로 자동형변환된 객체는 부모가 가지는 메소드와 필드만 사용가능
        ani.sound();
        // ani.run(); 부모가 가지는 메소드와 필드만 사용가능
        dog1.run();
        Animal ani2 = new Animal("동물",3);
        ani2.sound();
        //A instanceof B     A가 B의 인스턴스냐?
        //A객체가 B클래스로 만들어졌으면 true 아니면 false리턴
        System.out.println(ani instanceof Cat);
        change(new Dog("흰둥이",6));
        change(new Cat("도도",5));
    }
    public static void change(Animal ani){
        if(ani instanceof Dog){
            Dog d = (Dog) ani;
            d.sound();
        }
    }
}
