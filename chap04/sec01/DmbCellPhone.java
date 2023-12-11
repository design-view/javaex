package chap04.sec01;

public class DmbCellPhone extends CellPhone{
    int channel;
    //생성자
    DmbCellPhone(String model, String color, int channel){
        this.channel = channel;
        this.model = model;
        this.color = color;
        System.out.println("자식 생성자 호출");
    }
    void turnOnDmb(){
        System.out.println("dmb방송을 시작합니다.");
    }
}
