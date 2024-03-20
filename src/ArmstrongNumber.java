public class ArmstrongNumber {
        public static boolean isNarcissistic(int number) {
            char[] factor = String.valueOf(number).toCharArray();
            int sum = 0;
            for (char digit : factor) {
                sum += Math.pow(Character.getNumericValue(digit), factor.length);
            }
            return number == sum;
        }
    }
