package chap07.sec02;

public class AnimalExam {
    public static void main(String[] args) {
        Animal ani1 = new Cat();
        ani1.sound();
        //익명 자식 객체
        Animal ani2 = new Animal(){
            @Override
            void sound() {
                System.out.println("익명객체 소리를 냅니다.");
            }
        };
        ani2.sound();
    }
}
