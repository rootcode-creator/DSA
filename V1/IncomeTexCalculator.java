import java.util.Scanner;

public class IncomeTexCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the amount of meney you want to calculate tax for: ");
        int money = sc.nextInt();
        int tax;

        if (money <= 500000) {

            tax = 0;

        } else if ((money > 500000) && (money < 10000000)) {

            tax = (int) (money * 0.2);

        } else {

            tax = (int) (money * 0.3);
        }

        System.out.println("Your tax is: " + tax);

        sc.close();

    }
}
