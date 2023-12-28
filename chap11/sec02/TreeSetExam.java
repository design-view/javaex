package chap11.sec02;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExam {
    public static void main(String[] args) {
        TreeSet<Integer> intTree = new TreeSet<Integer>();
        intTree.add(10);
        intTree.add(8);
        intTree.add(1);
        intTree.add(2);
        intTree.add(20);
        intTree.add(7);
        intTree.add(22);

        Integer num1 = intTree.first();
        System.out.println("first()메소드 : " + num1);
        Integer num2 = intTree.last();
        System.out.println("last()메소드 : " + num2);
        Integer num3 = intTree.floor(15);
        System.out.println("floor()메소드 : " + num3);
        Integer num4 = intTree.ceiling(15);
        System.out.println("ceiling()메소드 : " + num4);
        Integer num5 = intTree.lower(10);
        System.out.println("lower()메소드 : " + num5);
        Integer num6 = intTree.higher(10);
        System.out.println("higher()메소드 : " + num6);
        Iterator<Integer> treeiter =  intTree.descendingIterator();
        System.out.println("내림차순 정렬 출력 ");
        while(treeiter.hasNext()){
            Integer n =  treeiter.next();
            System.out.println(n);
        }
        //내림차순 정렬된 NavigableSet객체를 리턴
        NavigableSet<Integer> naset = intTree.descendingSet();
        System.out.println(naset);
    }
}
