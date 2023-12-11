package chap03.sec03;

public class CarExam {
    public static void main(String[] args) {
        Car car1 = Car.getInstance();
        Car car2 = Car.getInstance();
        System.out.println(car1 == car2);
    }
}

