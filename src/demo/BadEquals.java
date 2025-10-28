package demo;
import java.util.Objects;
public class BadEquals {
  private final String id;
  public BadEquals(String id) { this.id = id; }
  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof BadEquals)) return false;
    BadEquals other = (BadEquals) o;
    return id == other.id; // BUG: uses '==' for String
  }
}
