package demo;
public class NullDeref {
  public static int lenOrZero(String s) {
    return s.length(); // BUG: possible NullPointerException
  }
}