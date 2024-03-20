public class CamelCase {
    static String toCamelCase(String s){
        StringBuilder solution = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-' || s.charAt(i) == '_') {
                solution.append(Character.toUpperCase(s.charAt(i + 1)));
                i++;
            }
            else
                solution.append(s.charAt(i));
        }
        return solution.toString();
    }
}
