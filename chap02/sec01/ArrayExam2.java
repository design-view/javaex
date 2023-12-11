package chap02.sec01;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExam2 {
    public static void main(String[] args) {
        String[] strarr = {"양념","후라이드","뿌링클"};
        Scanner scan = new Scanner(System.in);
        System.out.print("치킨 이름을 입력하세요 : ");
        //String str = scan.nextLine();
//        사용자가 입력한 값이 배열에 있는지 검색하여 있으면“OOO 치킨 배달 가능“,
//        없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
        boolean flag = true;
//        for (String s: strarr) {
//            if(s.equals(str)){
//                System.out.println(s+" 치킨 배달 가능");
//                flag = false;
//                break;
//            }
//        }
//        if(flag) {
//            System.out.println(str+" 치킨은 없는 메뉴입니다.");
//        }
        //05번문제
//        10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고 1~10 사이의 난수를
//        발생시켜 배열에 초기화 후 배열 전체 값과 그 값 중에서 최대값과 최소값을 출력
        int[] numarr = new int[10];
        for (int i = 0; i < numarr.length ; i++) {
            int random = (int) (Math.random() * 10)+1;
            numarr[i] = random;
        }
        int max = numarr[0];
        int min = numarr[0];
        for (int i = 1; i < numarr.length; i++) {
            //max에 담긴 값보다 배열에 있는값이 더크면 max값을 그값으로 변경
            max = max < numarr[i] ? numarr[i] : max;
            //min에 담긴 값보다 배열에 있는값이 더작읍면 min값을 그값으로 변경
            min = min > numarr[i] ? numarr[i] : min;
        }
        System.out.println(Arrays.toString(numarr));
        System.out.println("배열요소의 최소값은 : " + min);
        System.out.println("배열요소의 최대값은 : " + max);

        //06문제
        //로또 번호 자동 생성기 프로그램을 작성하는데 중복 값 없이
        //오름차순으로 정렬하여 출력하세요.
        //로또 번호 : 1~45
        int[] lotto = new int[6];
        for(int i=0; i<lotto.length; i++){
            int random = (int) (Math.random()*45)+1;
            lotto[i] = random;
            //배열요소에 값을 할당할때 그값이 배열요소에 있는지 체크
            for (int j = 0; j < i; j++) {
                if(lotto[i] == lotto[j]){
                    i--;
                    break;
                }
            }
        }
        //오름차순 정렬
        //[42,22,41,28,13 36]
        //0번째랑 1번째랑 값을 비교 1번째 값이 더 작으면 순서변경
        //[22,42,41,28,13,36]
        //0번째랑 2번째랑 값을 비교 2번째 값이 더 작으면 순서변경 그렇지 않으면 그대로
        //[22,42,41,28,13,36]
        //0번째랑 3번깨랑 값을 비교
        int temp = 0;
        for (int i = 0; i < lotto.length; i++) {
            for(int j=i+1; j < lotto.length; j++){
                if(lotto[i] > lotto[j]){
                    temp = lotto[i];
                    lotto[i] = lotto[j];
                    lotto[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(lotto));

    }
}
