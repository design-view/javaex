package chap04.sec01;

public class DmbExam {
    public static void main(String[] args) {
        DmbCellPhone dmb1 = new DmbCellPhone("삼성", "흰색",90);
        dmb1.powerOn();
        System.out.println(dmb1.color);
    }
}
