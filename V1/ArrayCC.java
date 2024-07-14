import java.util.Scanner;

public class ArrayCC {
    public static void main(String[] args) {
        int array[] = new int[100];
        Scanner sc = new Scanner(System.in);

        array[0] = sc.nextInt(); 
        array[1] = sc.nextInt();
        array[2] = sc.nextInt();

        System.out.println("array[0]" + array[0]);
        System.out.println("array[1]" + array[1]);
        System.out.println("array[2]" + array[2]);

        sc.close();
    }
}
