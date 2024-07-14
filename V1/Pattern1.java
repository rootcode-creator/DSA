import java.util.Scanner;

public class Pattern1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total line number:");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            
            for (int j = 0; j < i; j++) {
                
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();

    }
    
}
