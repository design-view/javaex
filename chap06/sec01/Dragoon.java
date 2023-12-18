package chap06.sec01;

public class Dragoon implements  Unit{
    String name;
    int hp;
    int attack;
    public Dragoon(String name){
        this(name, 150, 20);
    }
    public Dragoon(String name, int hp, int attack){
        this.name = name;
        this.hp = hp;
        this.attack = attack;
    }
    @Override
    public int getAttack() {
        return attack;
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
