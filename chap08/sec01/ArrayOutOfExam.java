package chap08.sec01;


public class ArrayOutOfExam {
    public static void main(String[] args) {
        int[] arr = new int[5];
        //실행예외
        //arr[5] = 10;
        String str = "1000z";
        //int result = Integer.parseInt(str);
        Animal ani = new Dog();   //자동형(타입)변환
        Dog dog1 = (Dog) ani;    //강제 형 변환 (캐스팅)
        Cat cat1 = (Cat) ani;
    }
}
