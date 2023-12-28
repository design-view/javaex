package chap12.sec03;



public class Person {
    public void action(Calculable calculable){
        double result = calculable.calc(10,4);
        System.out.println(result);
    }

    public Member getMember1(Creatable creatable){
        String id = "green";
        Member member = creatable.create(id);
        return  member;
    }
}
