package chap12.sec03;

public class MethodReferenceExam {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(new Calculable() {
            @Override
            public double calc(double x, double y) {
                return x-y;
            }
        });
        person.action((x,y)-> Computer.staticMethod(x,y));
        person.action(Computer::staticMethod);
        Computer com = new Computer();
        person.action(com::instanceMethod);
        person.getMember1(Member::new);
        person.getMember1(new Creatable() {
            @Override
            public Member create(String id) {
                return new Member(id);
            }
        });
        person.getMember1(id->new Member(id));
    }
}
