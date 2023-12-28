package chap09.sec04;

public class StringBuilderExam {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("green")
                .append("aaa")
                .append("bbb")
                .append("ccc")
                .insert(0,"zzz")
                .delete(0,3)
                .replace(0,2,"*****");
        String str = sb.toString();
        System.out.println(str);
    }
}
