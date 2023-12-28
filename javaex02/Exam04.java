package javaex02;

import java.util.Arrays;
import java.util.Scanner;

public class Exam04 {
    public static void main(String[] args) {
        int[] coinUnit = {50,500,10,100};
        //내림차순정렬
        for(int i=0; i<coinUnit.length; i++){
            for(int j=i+1; j<coinUnit.length; j++){
                int temp = 0;
                if(coinUnit[i] < coinUnit[j]){
                    temp = coinUnit[i];
                    coinUnit[i] = coinUnit[j];
                    coinUnit[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(coinUnit));

        Scanner scan = new Scanner(System.in);
        System.out.print("받은 금액 : ");
        int money = scan.nextInt();
        System.out.print("상품 금액 : ");
        int price = scan.nextInt();
        int change = money - price;
        int count = 0;
        for(int i=0; i<coinUnit.length; i++){
            count = change/coinUnit[i];
            System.out.println(coinUnit[i] + "원 동전 " + count + "개");
            //잔돈
            change = change % coinUnit[i];
        }
    }
}
