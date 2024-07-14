public class StringCompression {

    public static void compressString(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {

                count++;
                i++;
                
            }

            sb.append(str.charAt(i));

            if (count > 1) {

                sb.append(count);
            }

        }

        System.out.println("Compressed string: " + sb);

    }

    public static void main(String[] args) {

        String str = "aaabbbcddd";
        compressString(str);
    }
}
