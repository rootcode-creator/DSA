public class countingSort {

    public static void countingSortt(int number[]) {

        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {

            largest = Math.max(largest, number[i]);

        }

        int count[] = new int[largest + 1];

        for (int i = 0; i < number.length; i++) {

            count[number[i]]++;

        }

        int j = 0;

        for (int i = 0; i < count.length; i++) {

            while (count[i] > 0) {

                number[j] = i;
                j++;
                count[i]--;
            }

        }
    }

    public static void print(int number[]) {

        for (int i = 0; i < number.length; i++) {

            System.out.print(number[i] + " ");
        }
    }

    public static void main(String[] args) {

        int numbers[] = {1,4,1,3,2,4,3,7};

        countingSortt(numbers);
        print(numbers);

    }
}
