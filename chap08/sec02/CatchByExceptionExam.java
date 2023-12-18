package chap08.sec02;

public class CatchByExceptionExam {
    public static void main(String[] args) {
        //다중캐치
        try{
            int value1 = Integer.parseInt("z");
            String[] strarr = new String[3];
            strarr[3] = "AAA";

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스 범위를 벗어남");
        }catch (NumberFormatException e){
            System.out.println("숫자로 변환될수 없습니다.");
            //e.getMessage() 예외발생이유 리턴
            //e.toString() 예외클래스와 발생이유 리턴
            //e.printStackTrace() 예외발생이유 클래스
            //어디서 발생했는지 출력
            System.out.println(e.getMessage());
//            e.printStackTrace();
        }finally {
            System.out.println("마지막에 실행");
        }
    }
}
