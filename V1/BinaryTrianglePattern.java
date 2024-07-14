import java.util.Scanner;

public class BinaryTrianglePattern {
    public static void main(String[] args) {

        System.out.println("Enter the total line number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(
                "The number you enterd is " + number + " and the pattern created by your number is printed below:");

        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= i; j++) {

                if (i % 2 != 0) {

                    if (j % 2 != 0) {
                        System.out.print("1 ");
                    } else {

                        System.out.print("0 ");

                    }

                } else {

                    if (j % 2 != 0) {
                        System.out.print("0 ");
                    } else {

                        System.out.print("1 ");

                    }

                }

            }
            System.out.println();
        }
        sc.close();
    }
}
