import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");

        int number = sc.nextInt();

        boolean isPrime = true;

        if (number == 2) {

            

        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {

                    isPrime = false;
                    break;
                }
            }

        }

       if (isPrime) {
            System.out.println("The number " + number + " that you enterd is prime number");

        } else {
            System.out.println("The number " + number + " that you enterd is not prime number");

        }
        sc.close();
    }

}
