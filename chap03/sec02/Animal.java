package chap03.sec02;

public class Animal {
    static String kind="동물";
    int age;
    String name;
    void sound(){
        System.out.println("소리를 냅니다.");
    }
    //정적 멤버 , 정적 메소드
    //정적메소드 코드안에 인스턴스멤버
    //사용못함
    static void eat(){
        System.out.println("먹습니다.");
    }
}
