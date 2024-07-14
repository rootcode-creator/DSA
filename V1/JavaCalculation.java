import java.util.Scanner;

public class JavaCalculation {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of a and b :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int Sum = a + b;
        int Sub = a - b;
        int Mul = a * b;
        int Div = a / b;

        System.out.println("Summation of "+ a + " and "+ b + " is: "+ Sum);
        System.out.println("Subtraction of "+ b + " from "+ a + " is: "+ Sub);
        System.out.println("Multipication of "+ a + " and "+ b + " is: "+ Mul);
        System.out.println("Divition of "+ a + " by "+ b + " is: "+ Div);

        sc.close();
        
    }
    
}