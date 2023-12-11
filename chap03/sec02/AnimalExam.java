package chap03.sec02;

import java.util.Arrays;

public class AnimalExam {
    public static void main(String[] args) {
        //sound();
        //인스턴스 객체 생성
        Animal ani = new Animal();
        ani.sound();   //인스턴스 메소드
        //정적 메소드
        //클래스.메소드();
        Animal.eat();
        ani.name = "콩이";   //인스턴스 필드
        ani.age = 5;         //인스턴스 필드
        System.out.println();
        System.out.println(Animal.kind); //정적 필드
        printhi();

    }
    public static void printhi(){
        System.out.println("hi");
    }
}
