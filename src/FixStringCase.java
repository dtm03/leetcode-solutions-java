public class FixStringCase {
    public static String solve(final String s) {
        return s.length() < 2 * s.replaceAll("[a-z]","").length() ? s.toUpperCase() : s.toLowerCase();
    }
}
