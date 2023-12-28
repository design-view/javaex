package chap09.sec03;

public class ResourcePathExam {
    public static void main(String[] args) {
        //클래스의 경로를 이용해서 리소스의 절대경로 얻기
        Class personClass = Person.class;
        //getPath() 절대경로를 리턴
        String photo1path = personClass.getResource("dog.jpg").getPath();
        System.out.println(photo1path);
    }
}
