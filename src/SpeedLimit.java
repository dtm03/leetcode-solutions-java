public class SpeedLimit {

    public static int speedLimit(final int speed, final int[] signals) {
        int fine = 0;
        for (int i : signals) {
            int diff = speed - i;
            if (diff >= 10 && diff <= 19) fine += 100;
            else if (diff >= 20 && diff <= 29) fine += 250;
            else if (diff >= 30) fine += 500;
        }
        return fine;
    }
}
