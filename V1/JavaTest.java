public class JavaTest {
    public static void main(String[] args) {
        
        
        int n = 1;
        for (int i = 0; i < n; i++) {
            
           try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
            System.out.println("Terminating value is " + n + " and iterating value is "+ i);
            n++;
            
        }


    }
}
