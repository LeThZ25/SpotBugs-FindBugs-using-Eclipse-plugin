package demofixed;

public class Recursion {
    @Override
    public String toString() {
        return getClass().getSimpleName() + "@"
               + Integer.toHexString(System.identityHashCode(this));
    }
}
