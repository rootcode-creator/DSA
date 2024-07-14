public class FibonacciRec {

    public static int fibonacciR(int n) {

        if (n == 0 || n == 1) {
            return n;
        }
        int first = fibonacciR(n - 1);
        int second = fibonacciR(n - 2);

        return (first + second);

    }

    public static void main(String[] args) {

        int n = 3;
        System.out.println("The " + n + " th fibonacci term is: " + fibonacciR(n));

    }
}
