public class TowerOfHanoi {

    public static void hanoiCode(int n, String source, String helper, String destination) {

        if (n == 1) {

            System.out.println("Transfer disk from " + n + " from " + source + " to " + destination);
            return;

        }
        hanoiCode(n - 1, source, destination, helper);
        System.out.println("Transfer disk from " + n + " from " + source + " to " + destination);
        hanoiCode(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {

        int n = 2;
        hanoiCode(n, "S", "H", "D");
    }
}
