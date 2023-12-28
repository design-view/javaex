package javaex02;

public class ShapeExam {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.0);
        System.out.println("c1의 면적은 : " + c1.calcArea());
        Rectacgle r1 = new Rectacgle(10,20);
        System.out.println("r1의 면적은 : " + r1.calcArea());
    }
}
