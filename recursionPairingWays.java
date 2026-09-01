public class recursionPairingWays {
    public static int callGuest(int n) {
        if (n <= 1) {
            return 1;
        }
        int way1 = callGuest(n - 1);
        int way2 = (n - 1) * callGuest(n - 2);
        int totalWays = way1 + way2;
        return totalWays;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(callGuest(n));
    }
}
