import java.util.Scanner;

public class SolidRombos {

    public static void main(String[] args) {

        System.out.println("Enter the total line number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {


             for (int j = 1; j <= number - i ; j++) {

                System.out.print(" ");

            }
            // Star print
            for (int k = 1; k <= number; k++) {

                System.out.print("*");

            }
            System.out.println();
        }

        sc.close();

    }
}
