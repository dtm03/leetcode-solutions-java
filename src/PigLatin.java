public class PigLatin {
    public static String pigIt (String str) {
        String[] words = str.split(" ");
        StringBuilder ret = new StringBuilder();
        for (String word : words) {
            if (word.matches("[A-Za-z0-9]+")) {
                ret.append(word.substring(1) + word.charAt(0) + "ay ");
            }
            else
                ret.append(word);
        }
        if (Character.isLetterOrDigit(ret.charAt(ret.length() - 1))) {
            ret.deleteCharAt(ret.length() - 1);
        };
        return ret.toString();
    }

    // Alternative:
    // return str.replaceAll("(\\w)(\\w*)", "$2$1ay");

}

