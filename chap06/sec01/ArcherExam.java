package chap06.sec01;

public class ArcherExam {
    public static void main(String[] args) {
        Archer a1 = new Archer();
        a1.attack();

        //인터페이스 타입 변수 자동형변환
        Attackable a2 = new Archer();
        a2.attack();
    }
}
