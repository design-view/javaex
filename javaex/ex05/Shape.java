package javaex.ex05;

abstract class Shape {
    Point p;
    Shape(){
        this(new Point(0,0));
    }
    Shape(Point p){
        this.p = p;
    }
    abstract double calcArea();
    Point getPositon() {
        return p;
    }
    void setPosition(Point p){
        this.p = p;
    }

}
