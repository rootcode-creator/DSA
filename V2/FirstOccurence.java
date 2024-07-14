public class FirstOccurence {

    public static int fO(int array[], int key, int i) {

        if (i == (array.length )) {

            return -1;
        }
        if (array[i] == key) {

            return i;
        }

        return fO(array, key, i + 1);

    }

    public static void main(String[] args) {

        int array[] = { 8, 2, 6, 9, 5, 10, 2, 5, 3 };
        int key = 3;

        int index = fO(array, key, 0);
        
        if (index == -1) {
            System.out.println("Key has not been found!");
        } else {
            System.out.println("Key found in index: " + index);

        }
    }
}
