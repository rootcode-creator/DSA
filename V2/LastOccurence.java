public class LastOccurence {

    public static int Lo(int array[], int key, int i) {

        if (i == (array.length)) {

            return -1;
        }

        int value = Lo(array, key, i + 1);

        if (value == -1 && array[i] == key) {

            return i;
        }

        return value;

    }


    public static int Lo2(int array[], int key, int i) {

        if (i == -1) {

            return -1;
        }

       

        if (array[i] == key) {

            return i;
        }

        return Lo2(array, key, i - 1);

    }

    public static void main(String[] args) {

        int array[] = { 8, 3, 6, 9, 5, 10, 2, 5, 3 };
        int key = 88;

        int index = Lo2(array, key,array.length-1);

        if (index == -1) {
            System.out.println("Key has not been found!");
        } else {
            System.out.println("Key found in index: " + index);

        }
    }
}
