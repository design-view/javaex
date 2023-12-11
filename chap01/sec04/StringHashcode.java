package chap01.sec04;

public class StringHashcode {
    public static void main(String[] args) {
        String str1 = "그린";
        String str2 = "그린";
        String str3 = new String("그린");
        String str4 = new String("그린");

        System.out.println(str1==str2);
        System.out.println(str1.equals(str3));
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));



    }
}
