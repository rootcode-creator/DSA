import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {

        System.out.println("Enter the total line number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= number - i; j++) {

                System.out.print(" ");

            }

            for (int k = 1; k <= i ; k++) {

                System.out.print(i + " ");

            }
            System.out.println();
        }
        sc.close();
    }

}
