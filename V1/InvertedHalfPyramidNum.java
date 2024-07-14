import java.util.Scanner;

public class InvertedHalfPyramidNum {
    

    public static void inverted_half_pyramid_num( int number ){

        for (int i = number ; i >= 1; i--) {
            
            for (int j = 1; j <= i; j++) {
                

                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        

        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        inverted_half_pyramid_num(number);

        sc.close();
    }
}
