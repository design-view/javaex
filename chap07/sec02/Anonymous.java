package chap07.sec02;

public class Anonymous {
    //필드
    //Person타입의 필드에 익명객체 대입
    Person field = new Person() {
        void work(){
            System.out.println("출근합니다.");
        }
        @Override
        void wake() {
            System.out.println("6시에 일어납니다.");
            work();
        }
    };
    //생성자
    //메소드
    void method(){
        //로컬변수 값으로 익명객체 대입
        Person localv = new Person() {
            void walk(){
                System.out.println("산책합니다.");
            }
            @Override
            void wake() {
                System.out.println("7시에 일어납니다.");
                walk();
            }
        };
        localv.wake();
    }
}
