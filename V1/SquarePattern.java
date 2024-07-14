import java.util.Scanner;

public class SquarePattern {

    public static void main(String[] args) {

        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {

            for (int j = 0; j < number; j++) {

                System.out.print("*");

            }
            System.out.println();
        }

        sc.close();

    }
}
