package Thread.exam01;

public class UserThreadExam {
    public static void main(String[] args) {
        User user1 = new User();
        Thread th= new Thread(()->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            user1.setUserName("그린");
        });
        th.start();
        Thread th2= new Thread(()->{
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            user1.setUserName("블루");
        });
        th2.start();
        try {
            th.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(user1.getUserName());
        try {
            th2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(user1.getUserName());
    }
}
