import java.util.Scanner;

public class InvertedStar {

    public static void main(String[] args) {

        System.out.println("Enter the total line number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number - i; j++ ) {

                System.out.print("*");

            }
            System.out.println();
        }

        sc.close();

    }
}
