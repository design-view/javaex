package chap04.sec01;

import java.util.Arrays;

public class ArrayExam {
    public static void main(String[] args) {
        int[] intArr = new int[] {10,20,30,40,50};
        int[] intArr2 = new int[intArr.length];
        for(int i=0; i<intArr.length; i++){
            intArr2[i] = intArr[i];
        }
        intArr[0] = 100;
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(intArr2));
        int[] intArr3 = new int[intArr.length];
        System.arraycopy(intArr,0, intArr3, 0, 5);
        int[] intArr4 = Arrays.copyOf(intArr,5);
        System.out.println(Arrays.toString(intArr4));
        int[] intArr5 = Arrays.copyOfRange(intArr, 0, 5);
        System.out.println(Arrays.toString(intArr5));
        //split() 문자열 ---> 배열
        String str = "green,blue,red";
        String[] strArr = str.split(",");
        System.out.println(Arrays.toString(strArr));
        //join()메소드 정적메소드 String.join("",배열변수)  ---> 문자열리턴
        String str2 = String.join("****",strArr);
        System.out.println(str2);
    }
}
