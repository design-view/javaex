package chap12.sec03;

public class GreenCodingExam {
    public static void main(String[] args) {
        GreenCoding gc = new GreenCoding() {
            @Override
            public void nowCoding() {
                System.out.println("코딩을 하고있습니다.");
            }
        };
        gc.nowCoding();
        GreenCoding gc2 = ()-> System.out.println("람다로 코딩을 하고있습니다.");
        gc2.nowCoding();
    }
}
