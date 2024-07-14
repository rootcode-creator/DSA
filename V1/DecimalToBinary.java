import java.util.Scanner;

public class DecimalToBinary {

    public static void decimalToBinary(int decimal) {

        int decimalStore = decimal;
        int pow = 0, reminder = 0, binary = 0;

        while (decimal > 0) {

            reminder = decimal % 2;
            binary += (reminder * (int) Math.pow(10, pow));
            pow++;
            decimal /= 2;

        }

        System.out.println("The binary of entered decimal value " + decimalStore + " is: " + binary);
    }

    public static void main(String[] args) {

        System.out.println("Enter the value in decimal: ");
        Scanner sc = new Scanner(System.in);

        int decimalNumber = sc.nextInt();

        decimalToBinary(decimalNumber);

        sc.close();

    }

}
