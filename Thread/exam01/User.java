package Thread.exam01;

public class User {
    private String userName;

    public String getUserName() {
        return userName;
    }

    public synchronized void setUserName(String userName) {
        this.userName = userName;
    }
}
