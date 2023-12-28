package javaex.ex05;

public class Circle extends Shape{
    double r; //반지름
    Circle(double r){
        super(new Point(0,0));
        this.r=r;
    }
    @Override
    double calcArea() {
        return Math.PI*r*r;
    }
}
