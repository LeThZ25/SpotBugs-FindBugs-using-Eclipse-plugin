package demofixed;

import java.util.Objects;

public class BadEquals {
    private final String id;

    public BadEquals(String id) { this.id = id; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BadEquals)) return false;
        BadEquals other = (BadEquals) o;
        // value equality, not reference equality
        return Objects.equals(this.id, other.id);
    }

    @Override
    public int hashCode() {
        // keep contract with equals
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "BadEquals{id='" + id + "'}";
    }
}