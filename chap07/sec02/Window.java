package chap07.sec02;

public class Window {
    //필드
    Button btn1 = new Button();
    Button btn2 = new Button();

    //필드 초기값으로 익명 구현 객체 대입
    //Button클래스 안
    //OnClickListener 인터페이스 정적 멤버 인터페이스

    //중첩 클래스
    //바깥클래스.정적멤버클래스 b = new 바깥클래스.정적멤버클래스()
    //A.C c = new A.C();
    //A a = new A()
    //A.B b = a.new B();
    //중첩 인터페이스
    Button.OnClickListener listener = new Button.OnClickListener(){
        @Override
        public void onClick() {
            System.out.println("전화를 겁니다.");
        }
    };
    //생성자
    Window(){
        btn1.setOnClickListener(listener);
        btn2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("메시지를 보냅니다");
            }
        });
    }
}
