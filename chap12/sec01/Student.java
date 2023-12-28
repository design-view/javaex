package chap12.sec01;

public class Student implements Comparable<Student>{
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }

    @Override
    public int compareTo(Student o) {
        //return Integer.compare(score, o.score);
        //객체의 필드와 매개변수의 필드와 값비교
        //객체 필드값이 작으면 -1, 같으면 0, 크면 1을 리턴
        if(score < o.score){
            return -1;
        }else if(score == o.score){
            return 0;
        }else {
            return 1;
        }
    }
}
