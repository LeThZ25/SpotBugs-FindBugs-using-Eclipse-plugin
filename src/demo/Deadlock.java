package demo;
public class Deadlock {
  private final Object a = new Object();
  private final Object b = new Object();
  public void m1() { synchronized (a) { synchronized (b) { } } }
  public void m2() { synchronized (b) { synchronized (a) { } } } // BUG: reversed order
}
