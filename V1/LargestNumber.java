public class LargestNumber {
    public static int largestNumber(int number[]) {

        int largestNumber = number[0];

        for (int i = 0; i < number.length; i++) {

            if (number[i] > largestNumber) {

                largestNumber = number[i];
            } else {
                continue;
            }
        }

        return largestNumber;

    }

    public static void main(String[] args) {

        int array[] = { 300, 23, 56, 33, 45, 666, 354, 333, 44, 55, 663, 5345, 44, 634, 44, 33, 3 };

        int array2[] = {20,22,3,4,5,6};
        System.out.println(array2.length);
        System.out.println("The largest number in the array is: " + largestNumber(array));
    }
}
