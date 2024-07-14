public class SumNRec {
    

    public static int sumNatural(int number) {
        
        if (number == 1) {
            return 1;
        }
        return number + sumNatural(number - 1);

    }

    public static void main(String[] args) {
        
        int number = 5;
        System.out.println("Sum of " + number + " natural number is: " + sumNatural(number));
    }
}
