import java.util.Arrays;

public class AnagramEfficient {

    public static void anagram(String str, String str2) {

        str = str.toLowerCase();
        str2 = str2.toLowerCase();

        char cString1[] = str.toCharArray();
        char cString2[] = str2.toCharArray();

        boolean check = false;
        if (cString1.length == cString2.length) {

            Arrays.sort(cString1);
            Arrays.sort(cString2);

            check = Arrays.equals(cString1, cString2);
        }

        if (check) {
            System.out.println("Str and str2 are anagram");
        } else {

            System.out.println("Str and str2 are  not anagram");
        }

    }

    public static void main(String[] args) {

        String str = "Anjali";
        String str2 = "liaajk";
        anagram(str, str2);
    }
}
