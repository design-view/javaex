package chap11.sec02;

import java.util.Comparator;
import java.util.TreeSet;

public class PersonTreeSetExam {
    public static void main(String[] args) {
        TreeSet<Person> ptree = new TreeSet<Person>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getAge() < o2.getAge()){
                    return -1;
                }else if(o1.getAge() == o2.getAge()){
                    return 0;
                }else {
                    return 1;
                }
            }

         });
        ptree.add(new Person("원빈",40));
        ptree.add(new Person("공유",40));
        TreeSet<Person> ptree2 = new TreeSet<>((o1,o2)->{
            if(o1.getAge() < o2.getAge()){
                return -1;
            }else if(o1.getAge() == o2.getAge()){
                return 0;
            }else {
                return 1;
            }
        });
    }
}
