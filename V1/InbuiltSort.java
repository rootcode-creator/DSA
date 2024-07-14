import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {

    public static void print(Integer numbers[]) {

        for (int i = 0; i < numbers.length; i++) {

            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {

        Integer numbers[] = { 5, 3, 2, 4, 1 };

        Arrays.sort(numbers,0,3,Collections.reverseOrder());
        print(numbers);

    }
}
