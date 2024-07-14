public class KadanesAlgorithm {
    public static void subarrayPrinting(int array[]) {

        int currentSum = 0, maxSum = Integer.MIN_VALUE;
        int negMax = Integer.MIN_VALUE;

        int count = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] < 0) {

                count++;
                negMax = Math.max(negMax, array[i]);

            }

        }

        if (count == array.length) {

            System.out.println("All value of array is negative and among of them maximum is: " + negMax);
            return;
        }

        for (int i = 0; i < array.length; i++) {

            currentSum += array[i];
            if (currentSum < 0) {
                currentSum = 0;
            }

            maxSum = Math.max(currentSum, maxSum);

        }

        System.out.println("Maximum summation of sub-array is: " + maxSum);

    }

    public static void main(String[] args) {

        int array[] = { 2, 4, 6, 8, 10 };
        subarrayPrinting(array);

        int[] array2 = { 1, -2, 6, -1, 3 };
        subarrayPrinting(array2);

        int[] array3 = { -1, -2, -3, -4 };
        subarrayPrinting(array3);

         int[] array4 = { -300, -200, -500,-100,-2,-470 };
        subarrayPrinting(array4);
    }
}
