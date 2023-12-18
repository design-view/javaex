package chap06.sec01;

public interface RemoteControl {
    //상수,추상메소드
    //public static final생략가능
    //public arsract 생략가능
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
    //추상메소드
    void turnOn();
    void turnOff();
    void setVolume(int volume);

    //디폴트 메소드
    default void setMute(){
        System.out.println("음소거를 합니다.");
    }
    default void setVolumeIn(int volume) {
        if(volume>RemoteControl.MAX_VOLUME){
            setVolume(RemoteControl.MAX_VOLUME);
        }else if(volume<RemoteControl.MIN_VOLUME){
            setVolume(RemoteControl.MIN_VOLUME);
        }else {
            setVolume(volume);
        }
    };
    //정적 메소드
    static void sound(){
        System.out.println("소리낸다");
    }
}
