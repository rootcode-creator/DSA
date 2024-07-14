import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {
        
        System.out.println("Enter the number you want to check even and odd: ");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        String variable = (( number % 2 == 0) ? "Even" : "Odd");


        System.out.println("Your entered the number " + number + " which is " + variable );

        sc.close();

    }
    
}
