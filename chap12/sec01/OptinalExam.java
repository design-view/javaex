package chap12.sec01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OptinalExam {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        //카운팅 count()
        long count = Arrays.stream(arr).filter(n->n%2==0).count();
        System.out.println("2의 배수의 개수 : " + count);

        //최대값 max()
        int max = Arrays.stream(arr).filter(n->n%2==0)
                .max().getAsInt();
        System.out.println("2의 배수중 최대값 : " + max);

        List<Student> stuList = new ArrayList<>();
        stuList.add(new Student("학생1", 80));
        stuList.add(new Student("학생2", 70));
        stuList.add(new Student("학생3", 85));
        stuList.add(new Student("학생4", 65));
        stuList.add(new Student("학생5", 88));

        //strList 점수만 평균 구해서 출력
        double avg = stuList.stream().mapToInt(s->s.getScore())
                .average().getAsDouble();
        //strList 80점 이상인 학생들을 새로운 리스트로 생성
        List<Student> strList2 =  stuList.stream().filter(s->s.getScore() >= 80)
                .collect(Collectors.toList());

        for (Student student : strList2) {
            System.out.println(student.getName() + " : " + student.getScore());
        }
        //리스트를 스트림을 통해서 맵으로 변환
        Map<String,Integer> studentMap = stuList.stream()
                .collect(Collectors.toMap(
                        s->s.getName(),
                        s->s.getScore()
                ));

        int[] arr2 = {10,20,30,40,50,60};
        int[] arr3 = Arrays.stream(arr2).map(num->num+5).toArray();
        System.out.println(Arrays.toString(arr3));

        List<Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(20);
        numList.add(30);
        numList.add(40);
        numList.add(50);

        int[] arr4 = numList.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(arr4));
    }
}
