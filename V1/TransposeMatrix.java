public class TransposeMatrix {

    public static int[][] tMatrix(int numbers[][]) {

        int row = numbers.length;
        int col = numbers[0].length;

        int tpMatrix[][] = new int[col][row];
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                tpMatrix[j][i] = numbers[i][j];

            }

        }

        return tpMatrix;
    }

    public static void printMatrix(int matrix[][]) {

        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                System.out.print(matrix[i][j] + " ");

            }

            System.out.println();
        }

    }

    public static void main(String[] args) {

        int matrix[][] = { { 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 10 } };

        printMatrix(tMatrix(matrix));

    }
}
