package demofixed;

public class NullDeref {
    public static int lenOrZero(String s) {
        return (s == null) ? 0 : s.length();
    }
}
