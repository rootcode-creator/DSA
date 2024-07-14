public class IncersionSort {

    public static void incersionSortt(int number[]) {

        for (int i = 1; i < number.length; i++) {

            int current = number[i];
            int previous = i - 1;

            while (previous >= 0 && number[previous] > current) {

                number[previous + 1] = number[previous];
                previous--;
            }

            number[previous + 1] = current;
        }
    }

    public static void main(String[] args) {

        int number[] = { 5, 4, 1, 3, 2,3,2,4,8,9 };
        incersionSortt(number);

        for (int i = 0; i < number.length; i++) {

            System.out.print(number[i] + " ");
        }
    }
}
