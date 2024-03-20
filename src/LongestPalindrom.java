public class LongestPalindrom {
    public static int longestPalindrome(final String s) {
        int m = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (new StringBuilder(s.substring(i, j)).reverse().toString().equals(s.substring(i, j)) && j - i > m) m = j - i;
            }
        }
        return m;
    }
}
