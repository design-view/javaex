package chap03.sec01;

public class Car {
    //필드
    String company;
    String model;
    String color;
    //기본생성자 디폴트 생성자
    Car(){
      this("소나타","현대","흰색");
    }
    //매개변수 값 1개 받는 생성자
    Car(String model){
        //다른 생성자 호출 this();
        this(model, "현대","흰색");
    }
    //매개변수 값 2개 받는 생성자
    Car(String model, String company){
        this(model, company, "흰색");
    }
    //모든 필드를 초기화하는 생성자
    Car(String model, String company, String color){
        this.company = company;
        this.color = color;
        this.model = model;
    }
}
