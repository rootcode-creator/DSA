public class JavaUnaryOperator {

    public static void main(String[] args) {
        
        // Pre increment

        int a = 10;
        System.out.println(a);

        int b = ++a;

        System.out.println(a);
        System.out.println(b);


        // Post increment


        int x = 13;

        System.out.println(x);

        int y = x++;

        System.out.println(x);
        System.out.println(y);


        // Pre decrement

        int c = 12;

        System.out.println(c);

        int d = --c;

        System.out.println(c);
        System.out.println(d);


        // Post decrement

        int z = 20;
        System.out.println(z);

        int w = z--;
        System.out.println(z);
        System.out.println(w);

    }
    
}
