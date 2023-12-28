package javaex02;

public class Rectacgle extends Shape{
    int width;
    int height;
    Rectacgle(int width, int height){
        this.width = width;
        this.height= height;
    }
    @Override
    double calcArea() {
        return width*height;
    }
}
