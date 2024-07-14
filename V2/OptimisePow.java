public class OptimisePow {

    public static int pow(int x, int n) {

        if (n == 0) {
            return 1;
        }
        int halfSqare = pow(x, n / 2);
        int sq = halfSqare * halfSqare;

        if (n % 2 != 0) {

            return sq * x;
        }

        return sq;
    }

    public static void main(String[] args) {

        int x = 10;
        int n = 10;

        System.out.println("The power of " + x + " to the power " + n + " is: " + pow(x, n));
    }
}
