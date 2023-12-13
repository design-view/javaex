package chap05;

public class Tire {
    //필드
    public int maxRotation;
    public int accumulateRotation;
    public String location;
    //생성자
    public Tire(String location, int maxRotation){
        this.location = location;
        this.maxRotation = maxRotation;
    }
    //메소드
    public boolean roll(){
        ++accumulateRotation;  //회전수 1씩증가
        if(accumulateRotation < maxRotation){
            System.out.println(location + "Tire회전수 : "
                    + (maxRotation-accumulateRotation));
            return true;
        }else{
            System.out.println("*** " + location + "타이어 펑크 ***");
            return false;
        }
    }
}
