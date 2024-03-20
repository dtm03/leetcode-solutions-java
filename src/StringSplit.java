public class StringSplit {
    public static String[] solution(String s) {
        if (s.length() % 2 == 1) s += "_";
        String[] solution = new String[s.length() / 2];
        for (int i = 0; i < s.length() / 2; i++) {
            solution[i] = "" + s.charAt(2 * i) + s.charAt(2 * i + 1);
        }
        return solution;
    }
}
