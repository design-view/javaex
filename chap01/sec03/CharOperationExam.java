package chap01.sec03;

public class CharOperationExam {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 'A'+1;
        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);

        int num1 = 10;
        int num2 = 10;
        boolean result1 = (num1 == num2); //true
        boolean result2 = (num1 != num2); //false
        boolean result3 = (c1 < c2);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
    }
}
