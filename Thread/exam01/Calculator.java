package Thread.exam01;

public class Calculator {
    private int memory;

    public int getMemory() {
        return memory;
    }

    public synchronized  void setMemory(int memory) {
        this.memory = memory;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() +" : "+this.memory);

    }
}
