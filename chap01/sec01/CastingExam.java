package chap01.sec01;

public class CastingExam {
    public static void main(String[] args) {
        int intValue = 44032;
        char charValue = (char) intValue;
        System.out.println(charValue);
        //강제 형변환 casting (타입)
        double doubleValue = 2.2345;
        intValue = (int) doubleValue;   //2
        System.out.println(intValue);

        int num1 = 1;
        int num2 = 2;
        double result = (double) num1 / num2;
        System.out.println(result);

        char c1 = 'A';
        char c2 = 'a';
        int result2 = c1 + c2;
        int i1 = c1;
        int i2 = c2;
        System.out.println("A의 유니코드는 : " + i1);
        System.out.println("B의 유니코드는 : " + i2);
        System.out.println("char타입 더하기는 : " +result2);
        if(i1 >= 65 && i1 < 97){
            System.out.println("대문자입니다.");
        }
        int resultfun = addNum(10,20);
        System.out.println(resultfun);
    }
    public static int addNum(int x, int y){
       return x+y;
    }
}
