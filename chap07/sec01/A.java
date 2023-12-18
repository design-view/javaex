package chap07.sec01;

public class A {

    //인스턴스 멤버 클래스
    public class B {
        //필드
        int field1;
        static int field2; //인스턴스 멤버 클래스에서는 정적필드 사용X
        //생성자
        B(){
            System.out.println("B객체가 생성됨");
        }
        //메소드
        void method1(){
            System.out.println("B클래스 메소드 호출");
        }
        //정적메소드 사용X
        static void method2(){
            System.out.println("B클래스 정적메소드 호출");
        }; 
    }
    //정적 멤버 클래스
    static class C {
        int field1;
        static int field2;
        void method1(){}
        static void method2(){}
    }
    //생성자
    A(){
        System.out.println("A 객체가 생성됨");
    }
    void method(){
        //로컬 클래스 - 정적 멤버 O
        class D{
            int field1;
            static int field2;
            D(){
                System.out.println("D객체가 생성됨");
            }
            void method1(){
                System.out.println("D 메소드 호출");
            }
            static void method2(){
                System.out.println("D 정적 메소드 호출");
            }
        }
        D d = new D();
        d.field1 = 3;
        d.method1();
        D.method2();
        D.field2 = 4;
        System.out.println(D.field2);
    }
}
