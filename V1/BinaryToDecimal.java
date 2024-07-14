import java.util.Scanner;

public class BinaryToDecimal {

    public static void binaryToDecimal(int binary) {

        int reserveBinary = binary;
        int lastDigit, decimal = 0, pow = 0;

        while (binary > 0) {

            lastDigit = binary % 10;

            decimal  += lastDigit * (int) Math.pow(2, pow);
            pow++;
            binary /= 10;

        }

        System.out.println("The decimal of entered binary number " + reserveBinary + " is: " + decimal);
    }

    public static void main(String[] args) {

        System.out.println("Enter the number in binary: ");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        binaryToDecimal(number);

        sc.close();
    }
}