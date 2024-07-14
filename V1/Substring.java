public class Substring {

    public static String subStringg(String str, int SI, int EI) {

        String mkstr = "";

        for (int i = SI; i < EI; i++) {

            mkstr += str.charAt(i);

        }
        return mkstr;
    }

    public static void main(String[] args) {

        String str = "madam";

        System.out.println(subStringg(str, 0, 2));

        System.out.println(str.substring(0, 2));

    }
}
