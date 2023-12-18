package chap06.sec01;

public class SearchableExam {
    public static void main(String[] args) {
        SmartTelevision st1 = new SmartTelevision();
        RemoteControl st2 = new SmartTelevision();
        Searchable st3 = new SmartTelevision();
        st3.search("aaa");
    }
}
