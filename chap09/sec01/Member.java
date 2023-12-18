package chap09.sec01;

public class Member {
    String name;
    int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Member){
            Member mem = (Member) obj;
            if(this.name.equals(mem.name) && this.age == mem.age){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (name+age).hashCode();
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
