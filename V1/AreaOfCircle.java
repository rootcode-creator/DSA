import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        float radius = sc.nextFloat();
        float area = (float) (Math.PI* radius * radius);
        float circamfarance = (float) (2 * Math.PI * radius);

        System.out.println("Radias of the circle is " + radius + " and the area of the circle is " + area);
        System.out.println("Radias of the circle is " + radius + " and the circamfarance of the circle is " + circamfarance);

        sc.close();

    }
}
