import java.util.Scanner;

public class JavaInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String firstname = sc.next();
        // System.out.println(firstname);
        
        int i = sc.nextInt();
        System.out.println(i);


        String fullname = sc.nextLine();
        // String fullname2 = sc.nextLine();
        System.out.println(fullname);

        // Byte b = sc.nextByte();
        // System.out.println(b);

        // Boolean bool = sc.nextBoolean();
        // System.out.println(bool);

        // Short s = sc.nextShort();
        // System.out.println(s);

        // Long l = sc.nextLong();
        // System.out.println(l);

        sc.close();
    }
}
