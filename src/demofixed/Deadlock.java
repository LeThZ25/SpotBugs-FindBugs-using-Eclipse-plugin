package demofixed;

public class Deadlock {
    private final Object lock = new Object();
    private int counter;

    public void m1() {
        synchronized (lock) {
            counter++;
        }
    }
    public void m2() {
        synchronized (lock) {
            counter--;
        }
    }
}