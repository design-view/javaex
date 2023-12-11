package chap01.sec01;

public class VariableExam01 {
    public static void main(String[] args) {
        int num = 10;
        byte num2 = 127;
        char char1 = 'a';
        System.out.println("int타입 변수 :" +num);
        System.out.println("byte타입 변수 :" +num2);
        System.out.println("char타입 변수 :" +char1);

        int v1 = 15;
        if(v1>10){
            int v2;
            v2 = v1 - 10;
        }
        int v3 = v1 + 5;
    }
}
