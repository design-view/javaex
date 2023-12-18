package chap06.sec01;

public interface Unit {
    //상수
    int DATA = 10;
    //추상메소드
    int getAttack();
    int getHp();
    String getName();
    void setHp(int hp);
}
