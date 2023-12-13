package chap05;
//실행 클래스
public class CarExam {
    public static void main(String[] args) {
        Car car = new Car();
        for (int i = 0; i <= 5; i++) {
            int problemLocation = car.run();
            switch (problemLocation){
                case 1:
                    System.out.println("앞왼쪽 한국타이어로 교체");
                    car.frontLeftTire = new HankookTire("앞왼쪽",15);
                    break;
                case 2:
                    System.out.println("앞오른쪽 금호타이어로 교체");
                    car.frontRightTire = new KumhoTire("앞오른쪽",15);
                    break;
                case 3:
                    System.out.println("뒤왼쪽 금호타이어로 교체");
                    car.backLeftTire = new KumhoTire("뒤왼쪽",15);
                    break;
                case 4:
                    System.out.println("뒤오른쪽 한국타이어로 교체");
                    car.backRightTire = new HankookTire("뒤오른쪽",15);
                    break;
            }
            System.out.println("-------------------------------------");
        }
    }
}
