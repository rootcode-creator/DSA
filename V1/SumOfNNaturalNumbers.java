import java.util.Scanner;

public class SumOfNNaturalNumbers {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number:");
            int n = sc.nextInt();

            int sum = 0,index = 1;

            for (index = 1; index <= n; index++) {

                sum += index;

            }

            System.out.print("The sum of n natural numbers are: " + sum );

            sc.close();
        }
    }

}
