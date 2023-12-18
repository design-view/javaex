package chap06.sec01;

public class Zealot implements Unit{

    String name;
    int hp;
    int attck;

    public Zealot(String name){
        this(name,100,10);
    }
    public Zealot(String name, int hp, int attack){
        this.name = name;
        this.hp = hp;
        this.attck = attack;
    }
    @Override
    public int getAttack() {
        return attck;
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
        System.out.println(this.hp);
    }
}
