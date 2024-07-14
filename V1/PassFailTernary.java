import java.util.Scanner;

public class PassFailTernary {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        String result = (( number >= 33) ? "Pass" : "Fail" );


        System.out.println("You enterd the number " + number + " which is " + result);

        sc.close();



    }
}
