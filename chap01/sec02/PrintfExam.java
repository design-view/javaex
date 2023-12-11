package chap01.sec02;

public class PrintfExam {
    public static void main(String[] args) {
        int value = 123;
        //이스케이프 문자
        // \n 줄바꿈 \"  \'  \t
        //% 값의순번 플래그(-,0) 전체자리수 소수자리수 변환문자
        //전체자리수가 많으면 왼쪽의공백이 생김
        //플래그를 -로 지정 오른쪽 공백
        //플래그를 0로 지정 왼쪽공백을 0으로 채움
        //변환문자 d 정수 , f 실수 , s 문자열
        System.out.printf("상품의 가격: %d\n" , value);
        System.out.printf("상품의 가격: %10d\n" , value);
        System.out.printf("상품의 가격: %-10d\n" , value);
        System.out.printf("상품의 가격: %010d\n" , value);

        double area = 3.14159 * 10 * 10;
        System.out.printf("반지름이 %d인 원의 넓이 : %10.4f\n", 10, area);
        System.out.println("출력");
        System.out.print("출력");
        System.out.println();
        System.out.print("출력");
    }
}
