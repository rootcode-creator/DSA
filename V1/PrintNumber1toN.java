import java.util.Scanner;

public class PrintNumber1toN {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        
        for (int index = 1; index <= n; index++) {
            
            System.out.print(index + " ");
        }

        sc.close();
    }
}
