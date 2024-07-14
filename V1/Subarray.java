public class Subarray {

    public static void subarrayPrinting(int array[]) {

        int arrayLength = array.length;
        int size = ((arrayLength * (arrayLength + 1)) / 2);
        int storeSum[] = new int[size];
        int sum = 0, index = 0;
        System.out.println("Size of subarray sum store array: " + size);
        int totalSubarray = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                for (int p = i; p <= j; p++) {

                    System.out.print(array[p] + " ");
                    sum += array[p];
                }
                System.out.println();
                totalSubarray++;
                storeSum[index] = sum;
                index++;
                sum = 0;
            }
            System.out.println();
        }

        System.out.println("Total number of subarray is: " + totalSubarray);
        System.out.println();

        maxMin(storeSum);

    }

    public static void maxMin(int storeSum[]) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < storeSum.length; i++) {
            if (storeSum[i] > max) {
                max = storeSum[i];
            }
        }

        for (int i = 0; i < storeSum.length; i++) {
            if (storeSum[i] < min) {
                min = storeSum[i];
            }
        }

        System.out.println("The sum of sub-array are: ");

        for (int i = 0; i < storeSum.length; i++) {

            System.out.print(storeSum[i] + " ");
        }

        System.out.println();

        System.out.println();

        System.out.println("Maximum value of subarray is " + max + " and minimum value of subarray is " + min);

    }

    public static void main(String[] args) {

        int array[] = { 2, 4, 6, 8, 10 };
        subarrayPrinting(array);

        int[] array2 = {1,-2,6,-1,3};
        subarrayPrinting(array2);
    }
}
