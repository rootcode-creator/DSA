import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {

        System.out.println("Enter the total line number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= number - i; j++) {

                System.out.print(" ");

            }

            for (int k = 1; k <= 2 * i - 1; k++) {

                System.out.print("*");

            }
            System.out.println();
        }

        // 2nd part

        for (int i = number; i >= 1; i--) {

            for (int j = number - i ; j >= 1 ; j--) {

                System.out.print(" ");

            }

            for (int k = 2 * i - 1; k >= 1; k--) {

                System.out.print("*");

            }
            System.out.println();
        }

        sc.close();

    }
}
