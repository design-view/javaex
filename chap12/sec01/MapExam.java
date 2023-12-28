package chap12.sec01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class MapExam {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동",85));
        studentList.add(new Student("김길동",90));
        studentList.add(new Student("박길동",75));
        int sum = 0;
        for (Student s:
             studentList) {
            sum += s.getScore();
        }
        System.out.println("모든 점수의 합은 : " + sum);

        int sum2 = studentList.stream()
                .mapToInt(s->s.getScore()).sum();
        System.out.println("모든 점수의 합은 : "  + sum2);

        int[] intArray = {1,2,3,4,5};
        IntStream intStream =  Arrays.stream(intArray);
        intStream.boxed().forEach(obj-> System.out.println(obj));

        studentList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(s-> System.out.println(s.getName() + " : " +s.getScore()));
    }
}
