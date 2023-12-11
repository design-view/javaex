package chap02.sec01;

public class ScoreAverage {
    public static void main(String[] args) {
        //배열 생성하기
        //타입[] 변수 배열선언
        int[] nums = { 1,2,3,4,5};
        int[] nums2 = new int[5];  //길이가 5인배열 0,0,0,0,0

        String[] fruits;
        fruits = new String[] { "🍒","🍓","🍍","🍎"};
        //배열의 값접근 배열변수[인덱스]
        fruits[0] = "🥩";
        //System.out.println(fruits[0]);
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }

        int[] scores = {80,90,70,60,80,70,90,65,75,78};
        //합구하기
        //평균구하기
        int sum=0;
        double avg=0.0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        avg = (double) sum / scores.length;
        System.out.println("총점은 : " + sum);
        System.out.println("평균은 : " + avg);
    }
}
