package chap01.sec01;

public class PromitionExam {
    public static void main(String[] args) {

        //자동 타입 변환
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.println("intValue : " + intValue);

        char charValue = 'a';
        intValue = charValue;
        System.out.println("intValue : " + intValue);

        long longValue = intValue;
        System.out.println("longValue : " + longValue);

        float floatValue = longValue;
        System.out.println("floatValue : " + floatValue);

        float floatValue2 = 100.5f;
        double doubleValue = floatValue2;
        System.out.println("doubleValue : " + doubleValue);

        byte a = 10;
        byte b = 20;
        //정수타입의 연산의 결과는 int타입으로 자동변환
        //byte result = (byte) (a + b);
        int result = a + b;
        int inta = 20;
        float floatb = 10.256f;
        float resultfloat = inta + floatb;
        long longv = 1000L;
        long longResult =  a + inta + longv;
    }
}
