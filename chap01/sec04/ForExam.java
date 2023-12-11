package chap01.sec04;

public class ForExam {
    public static void main(String[] args) {
       /*
        *     i:0    1번
        **    i:1    2번
        ***   i:2    3번
        ****  i:3    4번
        ***** i:4  5번
        */
        for(int i=0; i<5; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        /*
         *****  i:0일때 5번    j:5  j>i j--  5,4,3,2,1
         ****   i:1일때 4번    j:5  j>1 j--  5,4,3,2
         ***    i:2일때 3번         j>2      5,4,3
         **     i:3일때 2번         j>3      5,4
         *      i:4일대 1번         j>4      5
         */
        for(int i=0; i<5; i++){
            for(int j=5; j>i; j--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
