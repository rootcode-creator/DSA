public class DiagonalSum {

    public static void diagonalSumm(int array[][]) {

        int pdSum = 0, sdSum = 0;

        for (int i = 0; i < array.length; i++) {

            pdSum += array[i][i];
            if (i != (array.length - 1 - i)) {

            }
            sdSum += array[i][array.length - 1 - i];

        }

        System.out.println("The primary diagonal sum is " + pdSum + " and secondary diagonal sum is " + sdSum
                + " and total diagonal sum is " + (pdSum + sdSum));
    }

    public static void main(String[] args) {

        int array[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        diagonalSumm(array);

    }
}
