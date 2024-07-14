import java.util.Scanner;

public class Palindrome {

    public static void palindrome(int value) {

        int number = value;
        int reverse = 0, lastDigit = 0;

        while (value > 0) {

            lastDigit = value % 10;
            reverse = reverse * 10 + lastDigit;

            value /= 10;
        }

        if (number == reverse) {

            System.out.println("The value you entered is " + number + " and it is a palindrome number");

        } else {

            System.out.println("The value you entered is " + number + " and it is not a palindrome number");

        }

    }

    public static void main(String[] args) {
        System.out.println("Enter a value that you want in reverse form");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        palindrome(number);
        sc.close();
    }

}
