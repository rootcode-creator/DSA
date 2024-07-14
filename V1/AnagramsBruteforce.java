public class AnagramsBruteforce {

    public static boolean anagramss(String str, String str2) {

        char string1[] = str.toCharArray();

        char string2[] = str2.toCharArray();

        boolean check[] = new boolean[str2.length()];

        if (string1.length != string2.length) {

            return false;
        }
        for (int i = 0; i < string1.length; i++) {

            for (int j = 0; j < string2.length; j++) {

                if (string2[j] == string1[i]) {

                    check[i] = true;

                }

            }
        }

        for (int i = 0; i < check.length; i++) {

            if (check[i] == false) {
                return false;
            }

        }

        return true;

    }

    public static void main(String[] args) {

        String str = "anjali";
        String str2 = "liaajp";

        System.out.println(anagramss(str, str2));

    }

}
