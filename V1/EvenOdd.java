import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        
       System.out.println("Enter the value you want to check for even or odd:");
       Scanner sc = new Scanner(System.in);
       int value = sc.nextInt();
       
        if ( value % 2 == 0 ) {
            
            System.out.println(value + " is even ");

        }else if (value % 2 != 0) {
            
            System.out.println(value + " is odd");
        }

        sc.close();
    }
}
