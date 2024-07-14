import java.util.HashSet;

public class DistinctNumber {

    public static boolean distinctBruteForce(int number[]) {

        for (int i = 0; i < number.length - 1; i++) {

            for (int j = i + 1; j < number.length; j++) {

                if (number[i] == number[j]) {
                    return true;
                }
            }
        }

        return false;

    }

    public static boolean distinctHash(int number[]) {

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < number.length; i++) {

            if (set.contains(number[i])) {
                return true;
            } else {
                set.add(number[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int nums[] = { 1, 2, 3, 1 };

        int nums2[] = { 1, 2, 3, 4 };

        int nums3[] = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

        // System.out.println(distinctBruteForce(nums));
        // System.out.println(distinctBruteForce(nums2));
        // System.out.println(distinctBruteForce(nums3));


        System.out.println(distinctHash(nums));
        System.out.println(distinctHash(nums2));
        System.out.println(distinctHash(nums3));
    }
}
