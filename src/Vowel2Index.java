public class Vowel2Index {

    public static String vowel2Index(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ("aeiouAEIOU".indexOf(s.charAt(i)) == -1) sb.append(s.charAt(i));
            else sb.append(i + 1);
        }
        return sb.toString();
    }

}
