package chap02.sec01;

import java.util.Arrays;

public class MultyArrayExam {
    public static void main(String[] args) {
        int[][] mathScores = new int[2][3];
        mathScores[0][0] = 70;
        mathScores[0][1] = 60;
        mathScores[0][2] = 80;
        mathScores[1][0] = 60;
        mathScores[1][1] = 90;
        mathScores[1][2] = 80;
        for (int[] intarr: mathScores) {
            for(int a : intarr){
                System.out.println(a);
            }
        }
        int[][] intarr2 = {{1,2,3},{1,2}};
        System.out.println("intarr2[0][2] : " + intarr2[0][2] );

        int[][] intarr3 = {
                {70,80,75,65,90},
                {66,88,70,65,90},
                {88,45,90,100,65}
        };
        //1학년 학생의 평균점수와 총점
        //2학년 학생의 평균점수와 총점
        //3학년 학생의 평균점수와 총점
        //for(타입 변수 : 배열변수)
        for (int i=0; i<intarr3.length; i++) {
            int sum = 0;
            double avg = 0;
            for(int num: intarr3[i]){
                sum += num;
            }
            avg = (double) sum / intarr3[i].length;
            System.out.println((i+1)+"학년의 총합은 : "+sum
                    +" , 평균은 : " + avg );
        }
    }
}
