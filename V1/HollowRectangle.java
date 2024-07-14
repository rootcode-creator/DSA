import java.util.Scanner;

public class HollowRectangle {

    public static void main(String[] args) {

        System.out.println("Enter the total number number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println("The number number you enterd is " + number
                + " and the pattern created by your number is printed below:");
        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= number + 1; j++) {

                // if (i == 1 || i == number || j == 1 || j == col) {
                if (i == 1 || i == number || j == 1 || j == number + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
        sc.close();
    }
}
