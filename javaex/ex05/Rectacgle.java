package javaex.ex05;

public class Rectacgle extends Shape{
    int width;
    int height;

    Rectacgle(int width, int height){
        super(new Point(0,0));
        this.width = width;
        this.height = height;
    }

    @Override
    double calcArea() {
        return width*height;
    }
}
