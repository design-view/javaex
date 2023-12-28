package javaex.ex04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        int[] coinUnit = {50,500,10,100};
        //내림차순 정렬
        for(int i=0; i<coinUnit.length; i++){
            for(int j=i+1; j<coinUnit.length; j++){
                int tmp = 0;
                if(coinUnit[i]<coinUnit[j]){
                    tmp = coinUnit[i];
                    coinUnit[i] = coinUnit[j];
                    coinUnit[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(coinUnit));
        Scanner sc = new Scanner(System.in);
        System.out.print("받은 금액 : ");
        int money = sc.nextInt();
        System.out.print("상품 금액 : ");
        int price = sc.nextInt();
        int change = money - price;
        int count = 0;
        for (int i = 0; i < coinUnit.length; i++) {
            count = change/coinUnit[i];
            System.out.println(coinUnit[i] + "원 동전 " + count + "개");
            change = change % coinUnit[i];
        }
    }
}
