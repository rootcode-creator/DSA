import java.util.Scanner;

public class SwitchCalculator {

    public static void main(String[] args) {

        int number1, number2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        number1 = sc.nextInt();
        System.out.println("Enter the first number: ");

        number2 = sc.nextInt();

        System.out.println("Enter the operation from +, -,  *,  /, % ");
        char operation = sc.next().charAt(0);

        switch (operation) {
            case '+':
                System.out.println(
                        "The result from adding" + number1 + " and " + number2 + " is: " + (number1 + number2));
                break;

            case '-':
                System.out.println(
                        "The result from subtracting" + number1 + " and " + number2 + " is: " + (number1 - number2));
                break;

            case '*':
                System.out.println(
                        "The result from multiplying" + number1 + " and " + number2 + " is: " + (number1 * number2));
                break;

            case '/':
                System.out.println(
                        "The result from deviding" + number1 + " and " + number2 + " is: " + (number1 / number2));
                break;

            case '%':
                System.out.println(
                        "The result of performing modulas on " + number1 + " and " + number2 + " is : "
                                + (number1 % number2));
                break;

            default:
                System.out.println("No operation selected");

        }

        sc.close();
    }

}
