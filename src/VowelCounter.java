public class VowelCounter {

    // Funktioniert nur für Inputs in Kleinbuchstaben
    public static int getCount(String str) {
        int numberOfVowels = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'i') {
                numberOfVowels++;
            }
        }
        return numberOfVowels;
    }
}
