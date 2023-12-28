package chap11.sec03;

import java.util.HashSet;
import java.util.Set;

public class SetExam02 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; set.size() < 6; i++) {
            //1~45
            int num = (int) (Math.random()*45)+1;
            set.add(num);
        }
        System.out.println(set);
    }

}
