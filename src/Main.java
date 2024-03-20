public class Main {
    public static void main(String[] args) {
        int number = 153;
        if (ArmstrongNumber.isNarcissistic(number)) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }

        int number2 = 370;
        if (Prime.isPrime(number2)) {
            System.out.println(number2 + " is a prime number");
        } else {
            System.out.println(number2 + " is not a prime number");
        }
    }
}
