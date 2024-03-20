public class Persistence {

    public static void main(String[] args) {
        System.out.println(crossProduct(25));
    }


    static int crossProduct(int number) {
        return Integer.toString(number)
                .chars()
                .reduce(1, (a,  b) -> a * b);
    }

}
