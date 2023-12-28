package chap11.sec01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam02 {
    public static void main(String[] args) {
        List<Board> listb = new ArrayList<>();
        //객체 추가
        listb.add(new Board("제목1", "내용1","글쓴이1"));
        listb.add(new Board("제목2", "내용2","글쓴이2"));
        listb.add(new Board("제목3", "내용3","글쓴이3"));
        listb.add(new Board("제목4", "내용4","글쓴이4"));
        listb.add(new Board("제목5", "내용5","글쓴이5"));

        System.out.println(listb);
        for (int i = 0; i < listb.size(); i++) {
            System.out.println(listb.get(i).getWriter());
        }
        for (Board b:
             listb) {
            System.out.println(b.getSubject());
        }
    }
}
