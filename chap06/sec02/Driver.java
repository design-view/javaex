package chap06.sec02;

public class Driver {
    public void drive(Vehicle vehicle){
        //Bus클래스의 인스턴스
        //Taxi
        if(vehicle instanceof Bus){
            Bus bus = (Bus) vehicle;
            bus.checkFare();
        }
        vehicle.run();
    }
}
