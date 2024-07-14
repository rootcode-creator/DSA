public class Tilling {
    

public static int tile(int n) {
    
    if (n == 0 || n == 1) {
        
        return 1;
    }
    // Vertical Tiling
    int fnm1 = tile(n-1);

    // Horizontal Tilling
    int fnm2 = tile(n-2);

    int total = fnm1 + fnm2;
    return total;
}


    public static void main(String[] args) {
        
        int number = 4;
        System.out.println("Floor lengtht = " + number + "\n Number of ways tiling can be done is = " + tile(number));
    }
}
