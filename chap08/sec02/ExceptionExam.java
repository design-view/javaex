package chap08.sec02;

public class ExceptionExam {
    public static void main(String[] args) throws ClassNotFoundException {

        //예외처리 코드 try{} catch(e){}
        //일반예외가 발생되는 코드는
        //컴파일러가 예외처리코드가 있는지 체크
        //예외처리코드가 없으면 예외처리코드를 작성하도록 함
        //1) try{} catch(e){}

        Class.forName("java.lang.String");
        System.out.println("dddd");

        System.out.println("하하하하하");

    }
}
