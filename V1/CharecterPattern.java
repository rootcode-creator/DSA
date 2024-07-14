import java.util.Scanner;

public class CharecterPattern {

    public static void main(String[] args) {
        
        System.out.println("Enter the total line number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        char alphabet = 'A';

        System.out.println("The number you enterd is " + number + " and the pattern created by your number is printed below:");
        for (int i = 1; i <= number ; i++) {
            
            for (int j = 1; j <= i ; j++) {
                
                System.out.print( alphabet + " ");
                alphabet++;
            }
            System.out.println();
        }
        sc.close();
    }
    
}
