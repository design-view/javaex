package chap05;

public class HankookTire extends Tire{
    public HankookTire(String location, int maxRotation){
        super(location, maxRotation);
    }

    //어노테이션
    @Override
    public boolean roll() {
        ++accumulateRotation;  //회전수 1씩증가
        if(accumulateRotation < maxRotation){
            System.out.println(location + "한국 Tire회전수 : "
                    + (maxRotation-accumulateRotation));
            return true;
        }else{
            System.out.println("*** " + location + "한국 타이어 펑크 ***");
            return false;
        }
    }
}
