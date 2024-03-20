public class FirstNonRepeated {
    public static Character firstNonRepeated(String str) {

        for (char ch : str.toCharArray()) if (str.indexOf(ch) == str.lastIndexOf(ch)) return ch;
        return 0;

        /*
        boolean copy = false;
        for (int i = 0; i < source.length(); i++) {
            for (int j = 0; j < source.length(); j++) {
                if (source.charAt(i) == source.charAt(j) && i != j) {
                    copy = true;
                    break;
                }
            }
            if (!copy) {
                return source.charAt(i);
            }
            copy = false;
        }
        return null;
         */
    }
}
