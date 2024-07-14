import java.util.Scanner;

public class BattarflyPattern {
    public static void main(String[] args) {

        System.out.println("Enter the total line number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Upper Part
        for (int i = 0; i < number; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print("*");

            }

            for (int k = 1; k < number - i; k++) {

                System.out.print(" ");

            }

            for (int l = 1; l < number - i; l++) {

                System.out.print(" ");

            }

            // Star print
            for (int m = 0; m <= i; m++) {

                System.out.print("*");

            }
            System.out.println();
        }

        // Below part
        for (int i = number; i > 0; i--) {

            // 1st part
            for (int j = i; j > 0; j--) {

                System.out.print("*");

            }

            for (int k = number - i; k > 0; k--) {

                System.out.print(" ");

            }

            for (int k = number - i; k > 0; k--) {

                System.out.print(" ");

            }

            // Star print
            for (int j = i; j >= 0; j--) {

                System.out.print("*");

            }
            System.out.println();
        }

        sc.close();

    }
}
