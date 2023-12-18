package chap07.sec01;

public class OuterClass {
    static int staField;
    public void outerMethod() {
        int localVar = 10;

        // 로컬 클래스 선언
        class LocalClass {
            private int localField;
            static int staticField;
            // 로컬 클래스의 인스턴스 메소드
            public void localMethod() {
                OuterClass.staField = 10;
                System.out.println(localVar); // 로컬 변수에 접근 가능
            }
            // 로컬 클래스의 정적 메소드
            static void staticMethod(){
                OuterClass.staField = 10;
                System.out.println("Ddddd");
            }
        }

        // 로컬 클래스의 인스턴스 생성
        LocalClass localInstance = new LocalClass();
        localInstance.localMethod();
        LocalClass.staticMethod();
    }
}

