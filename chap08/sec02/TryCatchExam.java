package chap08.sec02;

public class TryCatchExam {
    public static void main(String[] args) {
        int[] arr = new int[3];
        //arr 0~2
        try{
            arr[3]=10;
            arr[4]=20;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스 범위를 벗어났습니다.");
        }
        System.out.println("실행됩니다.");
        try{
            int value = Integer.parseInt("1000");
        }
        catch (NumberFormatException e){
            System.out.println("처리했어요");
        }
        finally {
            System.out.println("항상실행하는 구문");
        }
        System.out.println("실행됩니다.2");
    }
}
