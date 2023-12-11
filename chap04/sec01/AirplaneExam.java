package chap04.sec01;

public class AirplaneExam {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        sa.takeoff();
        sa.fly();
        sa.flyMode = 2;
        sa.fly();

    }
}
