package chap02.sec01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayNumExam {
    public static void main(String[] args) {
        int[] numArr = new int[0];
        int num;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("1~49 사이의 정수를 입력(-1은 종료) : ");
            num = scan.nextInt();
            //-1이면 반복 종료
            if(num == -1){
                break;
                //-1이 아니면서 1보다 작은수이거나 49보다 큰수이면
                //1~49사이 정수입력 출력
            }else if(num < 1 || num > 49){
                System.out.println("1~49사이 정수입력!!!!");
            }
            //위 조건이 다 아닐때 (1~49사이 이면)
            else {
                int[] numArr2 = new int[numArr.length+1];
                System.arraycopy(numArr,0, numArr2,0, numArr.length);
                numArr2[numArr2.length-1] = num;
                numArr = numArr2;
            }
        }
        System.out.println(Arrays.toString(numArr));
    }
}
