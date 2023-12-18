package chap06.sec01;

public class GameExam {
    public static void main(String[] args) {
        Zealot z1 = new Zealot("질럿1");
        Dragoon d1 = new Dragoon("드라곤1");
        attack(z1, d1);
    }
    public static void attack(Unit u1, Unit u2){
        u1.setHp(u1.getHp() - u2.getAttack());
        System.out.println(u1.getName()+ "이 "+u2.getName()+
                "에게 공격당해서 체력이 "+u1.getHp() +"으로 되었다.");
    }
}
