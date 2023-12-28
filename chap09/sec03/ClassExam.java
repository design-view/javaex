package chap09.sec03;

public class ClassExam {
    public static void main(String[] args) throws ClassNotFoundException {
        //첫번째 방법
        Class class1 = String.class;
        //두번째 방법
        Class class2 = Class.forName("java.lang.String");
        //세번째 방법
        String str = "green";
        Class class3 = str.getClass();

        System.out.println(class1.getName());
        System.out.println(class2.getSimpleName());
        System.out.println(class3.getPackage().getName());

        String str2 = "그린";
        Class classperson1 = Person.class;
        Class classperson2 = Class.forName("chap09.sec03.Person");
        Person person1 = new Person("철수",10);
        Class classperson3 = person1.getClass();

        System.out.println(classperson1.getName());
        System.out.println(classperson2.getSimpleName());
        System.out.println(classperson3.getPackage().getName());
    }
}
