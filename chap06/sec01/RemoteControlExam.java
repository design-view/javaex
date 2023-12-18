package chap06.sec01;

public class RemoteControlExam {
    public static void main(String[] args) {
        RemoteControl rc = new Television();
        rc.turnOn();
        rc.setVolumeIn(100);
        rc.turnOff();
        rc.setMute();
        RemoteControl.sound();
    }
}
