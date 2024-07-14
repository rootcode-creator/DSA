public class CheckSortedArray {

    public static boolean checkSort(int array[], int i) {

        if (i == (array.length - 1)) {

            return true;
        }
        if (array[i] > array[i + 1]) {

            return false;
        }

        return checkSort(array, i + 1);

    }

    public static void main(String[] args) {

        int array[] = { 5 };

        if (checkSort(array, 0)) {
            System.out.println("The array is sorted");
        } else {

            System.out.println("The array is not sorted");
        }
    }
}
