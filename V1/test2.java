public class test2 {

    public static void main(String[] args) {

        String str = "xyz";

        String str1 = new String("xyz").intern();

        System.out.println(str1 == str);

        // int x = 5;

        // if (x < 10) {
        //     System.out.println("c1");
        // }
        // if (x < 100) {
        //     System.out.println("c2");
        // }
        // if (x < 1000) {
        //     System.out.println("c3");
        // }

    }
}
