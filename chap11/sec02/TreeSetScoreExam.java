package chap11.sec02;

import com.sun.source.tree.Tree;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetScoreExam {
    public static void main(String[] args) {
        TreeSet<Integer> scores = new TreeSet<>();
        scores.add(90);
        scores.add(92);
        scores.add(80);
        scores.add(85);
        scores.add(100);
        System.out.println(scores);

        System.out.println("가장 낮은 점수는 : " + scores.first());
        //범위검색
        NavigableSet<Integer> hscores =  scores.headSet(90,false);
        System.out.println("90점 미만 : " + hscores);

        //범위검색 80점 이상
        NavigableSet<Integer> tscores = scores.tailSet(80,false);
        System.out.println("80점 미만 : " + tscores);

        //범위검색 85이상 95이하
        NavigableSet<Integer> fscores = scores.subSet(85, true,95, true);
        System.out.println("85이상 95이하 : " + fscores);
    }
}
