package chap07.sec03;

@FunctionalInterface
public interface GreenCoding {
    void greenMessage(String str);
    default void printhi(){
        System.out.println("hi");
    }
}
