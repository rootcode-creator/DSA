import java.util.Scanner;

public class EvenOddSum {

    public static void main(String[] args) {

        System.out.println("Enter the numbers and -1 to  exit from the program");
        Scanner sc = new Scanner(System.in);
        int number = 0, evenSum = 0, oddSum = 0;
        do {

            number = sc.nextInt();

            if (number < 0) {

            } else {

                if (number % 2 == 0) {

                    evenSum += number;

                } else {

                    oddSum += number;

                }
            }

        } while (number > 0);

        System.out.println("The even sum of your entered numbers are: " + evenSum);
        System.out.println("The odd sum of your entered numbers are: " + oddSum );

        sc.close();

    }
}
