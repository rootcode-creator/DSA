public class SpiralMatrix {

    public static void spiralMatrixx(int number[][]) {

        int startRow = 0;
        int startCol = 0;
        int endRow = number.length - 1;
        int endCol = number[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // This loop will print top of the spiral
            for (int i = startCol; i <= endCol; i++) {

                System.out.print(number[startRow][i] + " ");

            }

            // This loop will print right of the spiral
            for (int i = startRow + 1; i <= endRow; i++) {

                System.out.print(number[i][endCol] + " ");

            }

            // This loop will print bottom of the spiral
            for (int i = endCol - 1; i >= startCol; i--) {

                if (startRow == endRow) {
                    break;
                }
                System.out.print(number[endRow][i] + " ");
            }

            // This loop will print left of the spiral

            for (int i = endRow - 1; i >= startRow + 1; i--) {

                if (startCol == endCol) {
                    break;
                }
                System.out.print(number[i][startRow] + " ");
            }

            startRow++;
            startCol++;
            endRow--;
            endCol--;

        }

    }

    public static void main(String[] args) {

        // int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13,
        // 14, 15, 16 } };

        // spiralMatrixx(matrix);

        // int matrix2[][] = { { 1, 2, 3 }, { 5, 6, 7 }, { 9, 10, 11 } };
        // spiralMatrixx(matrix2);

        // int matrix3[][] = { { 1, 2, 3,4,5 }, { 6, 7, 8,9,10 }, { 11,12,13,14,15 },
        // {16,17,18,19,20}, {21,22,23,24,25} };
        // spiralMatrixx(matrix3);

        int matrix4[][] = { { 1, 2, 3, 4, 5 } };
        spiralMatrixx(matrix4);

    }
}
