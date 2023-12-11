package chap03.sec01;

public class StudentExam {
    public static void main(String[] args) {
        Student student1 = new Student("김그린",123,1,new int[] {90,80,70,65});
        Student student2 = new Student("홍길동",233,1,new int[] {70,90,55,60});
        Student student3 = new Student("박정우",523,2,new int[] {60,50,55,65});
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        System.out.println(student1.name + " 학생의 평균 : " + student1.calculateAverage());
    }
}
