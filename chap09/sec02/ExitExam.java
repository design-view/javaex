package chap09.sec02;

public class ExitExam {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i==5){
                System.exit(0);
            }
            System.out.println(i);
        }
        System.out.println("마무리코드");
    }
}
