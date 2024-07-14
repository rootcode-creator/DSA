import java.util.Scanner;

public class BinomialCoefficient {

    public static int factorial(int x) {

        int factorial = 1;

        for (int i = 1; i <= x; i++) {

            factorial *= i;
        }

        return factorial;
    }

    public static int binomialCoefficient(int a, int b) {

        int n = factorial(a);
        int r = factorial(b);
        int n_r = factorial(a - b);

        int binomialCoefficient = (n / (r * n_r));
        return binomialCoefficient;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n for binomial coefficient: ");

        int n = sc.nextInt();
        System.out.println("Enter the value of r for binomial coefficient: ");

        int r = sc.nextInt();

        int binomialCoefficient = binomialCoefficient(n, r);

        System.out.println("The Binomial Coefficient of value n = " + n + " and r = " + " is : " + binomialCoefficient);

        sc.close();
    }
}
