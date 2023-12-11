package chap03.sec02;

public class Calculator {
    //필드
    //생성자
    //메소드  리턴타입 메소드이름(매개변수 선언){  실행코드블럭 }
    void powerOn(){
        System.out.println("전원을 켭니다.");
        powerOff();
    }
    void powerOff(){
        System.out.println("전원을 끕니다.");
    }
    int plus(int x, int y){
        return x+y;
    }
    //메소드 오버로딩
    double plus(double x, double y){
        return x + y;
    }
    double divide(int x, int y){
        double result = (double) x/ y;
        return  result;
    }
    //나머지 매겨변수, 전달받는 데이터 갯수를 모를때
    int plusArr(int ...values){
        int sum = 0;
        for (int n:values) {
            sum += n;
        }
        return  sum;
    }
    int plusArr2(int[] values){
        int sum = 0;
        for (int n:values) {
            sum += n;
        }
        return  sum;
    }
}
