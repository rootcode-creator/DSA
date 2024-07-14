public class PrefixSum {

    public static void subarrayPrinting(int array[]) {

        int prefixSum[] = new int[array.length];
        int currentSum = 0, maxSum = Integer.MIN_VALUE;

        prefixSum[0] = array[0];
        for (int i = 1; i < array.length; i++) {

            prefixSum[i] = prefixSum[i - 1] + array[i];
        }

        for (int i = 0; i < array.length; i++) {

            System.out.print(prefixSum[i] + " ");

        }

        System.out.println();

        int totalSubarray = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {

                if (i == 0) {

                    currentSum = prefixSum[j];
                } else {
                    currentSum = prefixSum[j] - prefixSum[i - 1];
                    System.out.print(currentSum + " ");
                }
                totalSubarray++;
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        System.out.println();
        System.out.println("Total number of subarray is: " + totalSubarray + " and sum of maximum subarray is " + maxSum);

    }

    public static void main(String[] args) {

        // int array[] = { 2, 4, 6, 8, 10 };
        // subarrayPrinting(array);

        int[] array2 = { 1, -2, 6, -1, 3 };
        subarrayPrinting(array2);
    }
}