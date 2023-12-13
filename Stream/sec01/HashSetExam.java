package Stream.sec01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("java");
        set.add("green");
        set.add("oracle");
        Iterator<String> setiter =set.iterator();

        while (setiter.hasNext()){
            String s = setiter.next();
            System.out.println(s);
        }
    }
}
