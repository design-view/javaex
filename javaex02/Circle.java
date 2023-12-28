package javaex02;

public class Circle extends Shape{
    double r;

    Circle(double r){
        this.r = r;
    }
    @Override
    double calcArea() {
        //원의 면적 반지름 * 반지름 * 파이
        return r*r*Math.PI;
    }
}
