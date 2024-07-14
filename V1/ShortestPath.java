public class ShortestPath {

    public static void getShortestPath(String str) {

        int X = 0;
        int Y = 0;

        for (int i = 0; i < str.length(); i++) {

            char traverse = str.charAt(i);

            if (traverse == 'N' || traverse == 'n') {

                Y++;

            } else if (traverse == 'S' || traverse == 's') {

                Y--;

            } else if (traverse == 'W' || traverse == 'w') {

                X--;

            } else if (traverse == 'E' || traverse == 'e') {

                X++;

            }

        }

        float X2 = (float) Math.pow(X, 2);
        float Y2 = (float) Math.pow(Y, 2);

        float distance = (float) Math.sqrt(X2 + Y2);

        System.out.println("The shortest path is: " + distance);

    }

    public static void main(String[] args) {

        String str = "WNEENESENNN";
        // String str2 = "NS";
        getShortestPath(str);

    }
}
