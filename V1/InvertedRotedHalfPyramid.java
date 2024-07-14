import java.util.Scanner;

public class InvertedRotedHalfPyramid {
    public static void main(String[] args) {

        System.out.println("Enter the total line number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {

            // Space Print
            for (int j = 1; j < number - i; j++) {

                System.out.print(" ");

            }

            // Star print
            for (int k = 0; k <= i; k++) {

                System.out.print("*");

            }
            System.out.println();
        }

        sc.close();

    }

}
