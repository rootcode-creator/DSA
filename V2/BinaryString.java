public class BinaryString {
    

    public static void binString(int n, int lp,String str) {
        
        if (n == 0) {
            System.out.println(str);
            return ;
        }

        binString(n - 1, 0, str + "0");

        if (lp == 0) {
            
            binString(n - 1, 1, str + "1");

        }



    }
    public static void main(String[] args) {
        
        int n = 3;
        System.out.println("For value " + n + " uncosicutive strings are: ");
        binString(n, 0, "");
    }
}
