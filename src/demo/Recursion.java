package demo;
public class Recursion {
  @Override public String toString() {
    return toString(); // BUG: infinite recursion
  }
}