package chap03.sec02;

public class CalculatorExam {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        calc1.powerOn(); //메소드호출
        //매개변수가 있고 리턴타입입 있는 메소드 호출
        int result = calc1.plus(10,20);
        System.out.println("plus 메소드 호출결과 값은 : " + result);
        double result2 = calc1.divide(20,30);
        System.out.println("divide메소드 호출결과 값은 : " + result2);
        int sum1 = calc1.plusArr(1,2,3,4,5,6,7,8,9,10);
        int sum2 = calc1.plusArr(1,2,3);
        System.out.println(sum1);
        System.out.println(sum2);
        calc1.plusArr2(new int[] {1,2,3,4,5});
        int[] arr;
        arr = new int[] {1,23,4,5};
        int[] arr2 = {10,20,30};
        calc1.plusArr2(arr2);
        calc1.plus(1.123,2.123);
    }
}
