public class QuickSort {

    public static void printArray(int array[]) {

        for (int i = 0; i < array.length; i++) {

            System.out.print(array[i] + " ");
        }
    }

    public static void quickSort(int array[], int si, int ei) {

        // Base Case
        if (si >= ei) {

            return;
        }

        int pivotIndex = partition(array, si, ei);
        quickSort(array, si, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, ei);

    }

    public static int partition(int array[], int si, int ei) {

        // Choosing the pivot
        int pivot = array[ei];

        // Tracker of pivot sorter

        int i = si - 1;

        // Partion of array

        for (int j = si; j < ei; j++) {

            if (array[j] <= pivot) {

                i++;

                // Swap
                int temp = array[j];
                array[j] = array[i];
                array[i] = temp;

            }
        }

        i++;

        // Swap
        int temp = array[i];
        array[i] = array[ei];
        array[ei] = temp;

        return i;
    }

    public static void main(String[] args) {

        int array[] = {6, 3, 9, 8, 2, 5, -3};
        quickSort(array, 0, array.length - 1);
        printArray(array);
    }

}