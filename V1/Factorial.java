import java.util.Scanner;

public class Factorial {
    
    
    public static int factorial(int x){

        int factorial = 1;

        for (int i = 1; i <= x; i++) {
        
            factorial *= i;
        }

        
        return factorial;
    }
    
    public static void main(String[] args) {
        
        System.out.println("Enter the number you want to get factorial:");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        System.out.println("The factorial of given number " + number + " is: " + factorial(number) );
        
        sc.close();
    }
}
