package chap07.sec02;


public class RemoteExam {
    public static void main(String[] args) {
        RemoteControl rm = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("TV를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("TV를 끕니다.");
            }
        };
        rm.turnOff();
        rm.turnOn();
        Anonymousinter ai = new Anonymousinter();
        ai.rmField.turnOn();
        ai.rmField.turnOff();

        ai.method1();
        ai.method2(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("오디오오디오를 켭니다.");
            }

            @Override
            public void turnOff() {
                System.out.println("오디오오디오를 끕니다.");
            }
        });
    }


}
