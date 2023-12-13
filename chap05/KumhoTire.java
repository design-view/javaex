package chap05;

public class KumhoTire extends Tire{
    public KumhoTire(String location, int maxRotattion){
        super(location, maxRotattion);
    }
    //메소드 오버라이딩

    @Override
    public boolean roll() {
        ++accumulateRotation;  //회전수 1씩증가
        if(accumulateRotation < maxRotation){
            System.out.println(location + "금호Tire회전수 : "
                    + (maxRotation-accumulateRotation));
            return true;
        }else{
            System.out.println("*** " + location + "금호타이어 펑크 ***");
            return false;
        }
    }
}
