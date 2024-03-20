public class FormAcronym {
    public static String makeBackronym(String acronym) {
        StringBuilder solution = new StringBuilder();
        for (int i = 0; i < acronym.length(); i++) {
            if (i == 0 || acronym.charAt(i - 1) == ' ' && acronym.charAt(i) != ' ') {
                solution.append(acronym.charAt(i));
            }
        }
        return solution.toString();
    }
}
