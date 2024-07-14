public class PalindromicString {

    public static boolean pString(String str) {

        for (int i = 0; i < str.length() / 2; i++) {

            int n = str.length() - 1 - i;
            if (str.charAt(i) != str.charAt(n)) {

                return false;
            }

        }

        return true;
    }

    public static void main(String[] args) {

        String str = "mom";
        System.out.println("Is the string is pallindrome? " + pString(str));

    }
}
