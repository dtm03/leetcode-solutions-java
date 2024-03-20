public class PangramChecker {
    boolean check(String sentence) {
        sentence = sentence.toUpperCase();
        String[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        for (String letter : alphabet) {
            if (!sentence.contains(letter)) {
                return false;
            }
        }
        return true;
    }

    boolean check2(String sentence) {
        for (char c = 'a'; c <= 'z'; c++) {
            if (!sentence.toUpperCase().contains("" + c)) {
                return false;
            }
        }
        return true;
    }
}
