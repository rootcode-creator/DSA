import java.util.Scanner;

public class PrimeInRange {

    public static boolean isPrime(int number) {

        if (number == 2) {

            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {

                    return false;

                }
            }
            return true;
            
        }

    }

    public static void primeInRange(int range) {
        int count = 0;
        System.out.println("Prime numbers from range 2 to " + range + " are: ");
        for (int i = 2; i <= range; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println("Total prime numbers = " + count);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range:");

        int range = sc.nextInt();

        primeInRange(range);

        sc.close();
    }
}
