import java.util.Scanner;

public class MultipleOfTenCheck {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       

        // for (; ; ) {
        
        //     number = sc.nextInt();

        //     if (number % 10 == 0){
        //         break;
        //     }
        // }


        do {
            System.out.println("Enter the number:");

             int number = sc.nextInt();
             if (number % 10 == 0){
                break;
            }
            System.out.println("You entered number "+ number);
        
        } while (true);




        System.out.println("out of the loop");
        sc.close();
    }
    
}