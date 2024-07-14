public class PrintNNumbers {

    public static void nPrintDec(int number) {

        if (number == 1) {
            System.out.print(number + " ");
            return;
        }

        System.out.print(number + " ");
        nPrintDec(number - 1);

    }

    public static void nPrintInc(int number) {

        if (number == 1) {
            System.out.print(number + " ");
            return;
        }
        nPrintInc(number - 1);
        System.out.print(number + " ");

    }

    public static void main(String[] args) {

        int n = 10;
        System.out.println("Printing of " + n + " numbers in decreasing order");
        nPrintDec(n);

        System.out.println();

        System.out.println("Printing of " + n + " numbers in increasing order");
        nPrintInc(n);

    }
}
