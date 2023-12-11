package chap03.sec01;

public class Circle {
    //데이터 - 필드
    int x, y;
    int radius;

    //생성자 오버로딩 (Constructor Overloading)
    //동일한 클래스 내에서 여러개의 생성자를 정의하는것
    //각각의 생성자는 서로 다른 매개변수를 가짐
    //이를 통해 다양한 방식으로 객체를 초기화 할수있음.
    public Circle(){

    }
    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    //기능 - 메소드
    void showInfo(){
        System.out.println("중심점 : " + x +" , " + y + "반지름 : " + radius);
    }
}
