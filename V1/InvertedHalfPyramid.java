import java.util.Scanner;

public class InvertedHalfPyramid {

    public static void main(String[] args) {

        System.out.println("Enter the total line number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {

            // Star print
            for (int k = 1; k <= (number - i +1); k++) {

                System.out.print(k);

            }
            System.out.println();
        }

        sc.close();

    }

}
