public class LargestString {

    public static void largestStringg(String array[]) {

        String largest = array[0];

        for (int i = 0; i < array.length; i++) {

            if (largest.compareToIgnoreCase(array[i]) < 0) {

                largest = array[i];

            }
        }

        System.out.println("Largest: " + largest);

    }

    public static void main(String[] args) {

        String array[] = { "apple", "mango", "banana" };

        largestStringg(array);
    }

}
