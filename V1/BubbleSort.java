public class BubbleSort {

    public static void bubbleSortt(int numbers[]) {

        for (int i = 0; i < numbers.length - 1; i++) {

            int swap = 0;
            for (int j = 0; j < numbers.length - 1; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                    swap++;
                }
            }
            if (swap == 0)
                break;

        }
    }

    public static void main(String[] args) {

        // int numbers[] = { 5, 4, 1, 3, 2 };

        // bubbleSortt(numbers);

        // for (int i = 0; i < numbers.length; i++) {

        //     System.out.print(numbers[i] + " ");
        // }
        int numbers2[] = {1,2,3,4,5 };
        bubbleSortt(numbers2);

    }

}