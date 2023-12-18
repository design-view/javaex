package chap07.sec01;

public class AExam {
    public static void main(String[] args) {
        //바깥 클래스 인스턴스 생성
        A a = new A();
        //인스턴스 멤버 클래스는 바깥 클래스의 인스턴스가
        //있어야만 생성가능
        A.B b = a.new B();
        b.method1();
        //A.B.method2();  체크
        //정적 멤버 클래스 생성  
        //바깥클래스.내부클래스 변수 = new 바깥클래스.내부클래스();
        A.C c = new A.C();
        //로컬클래스 생성을 위한 메소드 호출
        a.method();
    }
}
