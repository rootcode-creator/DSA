public class FactorialRec {
    

    public static int factorial(int number) {
        
        if (number == 0) {
            return 1;
        }

        int fn = number * factorial(number - 1);
        return fn;
    }


    public static void main(String[] args) {
        
        int number = 5;

        System.out.println("The factorial of " + number + " is: " + factorial(number));
    }

}
