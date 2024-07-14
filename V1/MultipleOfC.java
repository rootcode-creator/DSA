import java.util.Scanner;

public class MultipleOfC {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        do {
            
            System.out.println("Enter the number:");
            int number = sc.nextInt();

            if (number % 10 == 0) {
                
                continue;
            }

            System.out.println("You entered the number "+ number );

        } while (true);

      
        
    }
    
}
