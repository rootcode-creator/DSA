import java.util.Scanner;

public class PalindromicPyramid {
    
     public static void main(String[] args) {

        System.out.println("Enter the total line number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {

            for (int j = 1; j <= number - i; j++) {

                System.out.print(" ");

            }

            for (int k = i; k >= 1 ; k--) {

                System.out.print(k);

            }

            for (int l = 1; l <= i ; l++) {

                if (l== 1) {
                    continue;
                } else {
                    System.out.print(l);
                }
                

            }

            System.out.println();
        }
        sc.close();
    }
}
