package javaex02;

public class Exam01 {
    public static void main(String[] args) {

        //String[] fruits = {"사과","귤","포도","복숭아","참외"};
        String[] fruits = new String[5];
        //fruits = new String[] {"사과","귤","포도","복숭아","참외"};
        fruits[0] = "사과";
        fruits[1] = "귤";
        fruits[2] = "포도";
        fruits[3] = "복숭아";
        fruits[4] = "참외";
        System.out.println(fruits[1]);

        //2번
        int[] starnums = {3,4,5,6,7};
        for(int i=0; i<starnums.length; i++){
            for(int j=0; j<starnums[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //3번
        int[][] arr = {{10,10,10,10,10},{20,20,20,20,20},{30,30,30,30,30}};
        int sum = 0;
        int num = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                sum += arr[i][j];
            }
            num += arr[i].length;
        }
        System.out.println("총합은 : " + sum + " , 평균은 : " + sum/num );

    }
}
