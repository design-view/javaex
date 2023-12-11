package chap04.sec01;

public class SupersonicAirplane extends Airplane {
    public int flyMode = 1;
    public final String name = "plane";

    //@어노테이션 -컴파일러에게 힌트를 제공
    @Override
    public void fly() {
       if(flyMode == 2){
           System.out.println("초음속비행입니다.");
       }else {
           super.fly();
       }

    }
}
