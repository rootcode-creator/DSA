import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int array[], int key) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == key) {

                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        System.out.println("Enter the value you want to search in array:");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        int array[] = { 2, 3, 4, 5, 6, 7, 8, 5, 4, 2, 1, 0 };

        int result = linearSearch(array, key);

        if (result == -1) {
            System.out.println("Not Found ");
        } else {
            System.out.println("Found the number in array that you wanted");
        }
        sc.close();
    }
}
