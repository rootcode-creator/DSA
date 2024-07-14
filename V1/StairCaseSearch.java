public class StairCaseSearch {

    public static void stairCaseSearchh(int numbers[][], int key) {

        int row = numbers.length - 1;
        int col = 0;

        while (row >= 0 && col <= (numbers[0].length - 1)) {

            if (numbers[row][col] == key) {

                System.out.println("The position of key: " + "[" + row + "," + col + "] ");

                return;

            } else if (numbers[row][col] > key) {
                row--;

            } else if (numbers[row][col] < key) {

                col++;

            }
        }

        System.out.println("Key doesn't found! ");
        return;
    }

    public static void main(String[] args) {

        int matrix[][] = { { 10, 20, 30, 40 },
                            { 15, 25, 35, 45 },
                            { 27, 29, 37, 48 },
                            { 32, 33, 39, 50 }};

        stairCaseSearchh(matrix, 29);
    }
}
