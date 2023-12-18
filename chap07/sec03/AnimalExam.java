package chap07.sec03;

public class AnimalExam {
    public static void main(String[] args) {
        Animal ani1 = new Animal() {
            @Override
            public void sound() {
                System.out.println("냐옹");
            }
        };
        Animal ani2 = ()->{
            System.out.println("멍멍");
        };
        ani1.sound();
        ani2.sound();
        //람다익명객체
        //매개변수 하나면 ()생략가능
        //실행문이 한줄이면 {}생략가능
        
        GreenCoding gr = str-> System.out.println(str);
        gr.greenMessage("재미있는람다");
        GreenCoding2 gr2;
        gr2 = () -> { return "안녕하세요"; };
        System.out.println(gr2.greenCoding());
        //실행문이 한줄이면 {} 생략가능
        //이때 return문이면 return도 생략해야한다.
        gr2 = () -> "목요일이에요";
        System.out.println(gr2.greenCoding());
        GreenCoding3 gr3 = (str)->{ return str+"안녕"; };
        System.out.println(gr3.myCoding("그린님"));
    }
}
