package chap07.sec02;

public class Anonymousinter {
    //필드
    //필드 초기값으로 익명 구현객체 대입
    RemoteControl rmField = new RemoteControl() {
        @Override
        public void turnOn() {
            System.out.println("오디오를 켭니다.");
        }

        @Override
        public void turnOff() {
            System.out.println("오디오를 끕니다.");
        }
    };
    void method1(){
        //로컬 변수 값으로 대입
        RemoteControl localrm = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("스마트티비를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("스마트티비를 끕니다.");
            }
        };
        localrm.turnOn();
        localrm.turnOff();
    }
    void method2(RemoteControl rm){
        rm.turnOn();
        rm.turnOff();
    }
}
