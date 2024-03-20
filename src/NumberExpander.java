
public class NumberExpander {
    public static String expandedForm(int num)
    {
        StringBuffer res = new StringBuffer();
        int d = 1;
        while(num > 0) {
            int nextDigit = num % 10;
            num /= 10;
            if (nextDigit > 0) {
                res.insert(0, d * nextDigit);
                res.insert(0, " + ");
            }
            d *= 10;
        }

        return res.substring(3).toString();

        /*
        char[] numca = Integer.toString(num).toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numca.length - 1; i++) {
            if (Character.getNumericValue(numca[i]) != 0) {
                result.append(numca[i]).append("0".repeat(numca.length - (i + 1))).append(" + ");
            }
        }
        if (Character.getNumericValue(numca[numca.length - 1]) != 0) {
            result.delete(result.length() - 3,result.length() - 1);
        }
        else {
            result.append(numca[numca.length - 1]);
        }
        return result.toString();
         */
    }

}
