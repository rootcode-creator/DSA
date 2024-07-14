public class UpperCase {

    public static void convertCase(String str) {

        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == ' ') {

                sb.append(str.charAt(i));
                sb.append(Character.toUpperCase(str.charAt(i + 1)));
                i++;

            } else {

                sb.append(str.charAt(i));
            }

        }

        System.out.println("String is: " + sb);

    }

    public static void main(String[] args) {

        String str = "my name is shakil";
        convertCase(str);
    }
}
