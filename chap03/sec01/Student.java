package chap03.sec01;

import java.util.Arrays;

public class Student {
    //이름(name), 학번(studentId), 학년(grade), 성적(score)
    public String name;
    public int studentId;
    public int grade;
    public int[] score;
    //생성자
    public Student(String name, int studentId, int grade, int[] score){
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
        this.score = score;
    }
    //메소드
    public void displayInfo(){
        System.out.println("이름은 : "+name+ " , 학번은 : " + studentId
                + " , 학년은"  + grade + ", 점수는 : "+ Arrays.toString(score) +"이다.");
    }
    //성적의 평균을 계산해서 반환하는메소드
    public double calculateAverage(){
        int sum = 0;
        for (int sc: this.score
             ) {
            sum += sc;
        }
        return (double) sum/ score.length;
    }
}
