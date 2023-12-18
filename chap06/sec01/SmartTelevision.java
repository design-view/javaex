package chap06.sec01;

public class SmartTelevision implements RemoteControl, Searchable{
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
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }else if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("스마트텔레비젼의 볼륨은 : " +this.volume);
    }

    @Override
    public void search(String url) {
        System.out.println(url + "을 탐색합니다.");
    }
}
