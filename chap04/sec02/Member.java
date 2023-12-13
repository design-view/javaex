package chap04.sec02;

 class Member {
    String name;
    int age;
    //생성자
    Member(String name, int age){
        this.name = name;
        this.age = age;
    }
    void sing(){
        System.out.println("가입하다");
    }
}
