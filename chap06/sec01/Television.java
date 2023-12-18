package chap06.sec01;

public class Television implements RemoteControl{

    private int volume;
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume=volume;
        System.out.println("TV볼륨 : " + this.volume);
    }
}
