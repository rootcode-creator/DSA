import java.util.Scanner;

public class BinarySearch {

    public static int binarySearch(int array[], int key) {

        int start = 0;
        int end = array.length - 1;
        while (start <= end) {

            int mid = (start + end) / 2;

            if (array[mid] == key) {

                return mid;
            }
            if (key > array[mid]) {

                start = mid + 1;

            }
            if (key < array[mid]) {

                end = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {

        int array[] = { 2, 4, 5, 6, 7, 8, 9, 12, 23, 45 };

        System.out.println("Enter the key to search: ");
        Scanner sc = new Scanner(System.in);

        int key = sc.nextInt();

        int result = binarySearch(array, key);

        if (result == -1) {
            System.out.println(
                    "You entered the key to search is " + key + " and it doesn't match with any value in array!");

        } else {

            System.out.println(
                    "You entered the key to search is " + key + " and it matched with value " + key + " in array ");
        }

        sc.close();

    }
}
