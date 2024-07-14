import java.util.Scanner;

public class GreaterBetweenThree {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first value: ");
        int first = sc.nextInt();
        
        System.out.println("Enter the second value:");
        int second = sc.nextInt();
        
        System.out.println("Enter the third value:");
        int third = sc.nextInt();

        if ( ( first > second ) && ( first > third ) ) {
            
            System.out.println(first + " greater among three values.");
        } else if ( ( second > first ) && ( second > third ) ) {
            
            System.out.println(second + " greater among three values.");
        }else if ( ( third > first ) && ( third > second ) ) {
            
            System.out.println(third + " greater among three values.");
        }


        sc.close();

    }


}
