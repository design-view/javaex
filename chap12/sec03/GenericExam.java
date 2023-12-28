package chap12.sec03;

public class GenericExam {
    public static void main(String[] args) {
        boolean result = compare(10,20);
        System.out.println(result);
    }
    public static <T extends Number> boolean compare(T t1, T t2){
        return t1 == t2;
    }
}
