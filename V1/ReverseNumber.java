import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        for (; number > 0;) {

            int digit = number % 10;
            System.out.print(digit);
            number /= 10;
        }

        sc.close();
    }
}
