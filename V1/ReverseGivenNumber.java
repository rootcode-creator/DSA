import java.util.Scanner;

public class ReverseGivenNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();
        int store = number;
        int reverse = 0;
        for (; number > 0;) {

            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;

        }

        System.out.println("The reverse of " + store + " is: " + reverse);

        sc.close();
        

    }
}
