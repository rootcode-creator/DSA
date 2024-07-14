import java.util.Scanner;

public class JavaTypeConversion {

    public static void main(String[] args) {
        
        // This type of conversion is allowed in java
        Scanner sc = new Scanner(System.in);
        float f =sc.nextInt();
        System.out.println(f);

        // This type of conversion is not allowed in java
        // int i = sc.nextFloat();
        // System.out.println(i);

        sc.close();

    }
    
}