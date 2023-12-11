package chap02.sec01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExam {
    public static void main(String[] args) {
        //01문제
        //arr배열안에 변경하고 싶은 인덱스 번호를 입력
        //받아서 그 값을 1000으로 변경하시오
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        Scanner scan = new Scanner(System.in);
        System.out.print("인덱스 번호 입력해주세요 : ");
        int idx = scan.nextInt();
        arr[idx] = 1000;
        System.out.println(Arrays.toString(arr));

        //02문제
        //인덱스 번호 2개를 입력받아, 그 값을 서로 바꿔보자.
        //예) 인덱스: 1    인덱스: 2
        int[] arr2 = {1,2,3,4,5};
        System.out.print("인덱스 번호 첫번째 입력 :");
        int num2 = scan.nextInt();
        System.out.print("인덱스 번호 두번째 입력 :");
        int num3 = scan.nextInt();
        int temp = arr2[num2];
        arr2[num2] = arr2[num3];
        arr2[num3] = temp;
        System.out.println(Arrays.toString(arr2));

//       03문제
//       사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고 1부터 입력
//       받은 값까지 배열에 초기화한 후 출력하세요.
        System.out.print("배열길이를 입력하세요 : ");
        int size = scan.nextInt();
        int[] arr3 = new int[size];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = i+1;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
