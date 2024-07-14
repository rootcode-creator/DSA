public class JavaTypePromotionExpression {
    
    
    public static void main(String[] args) {
        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        // int ans = d + b + a + c;




        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // System.out.println(ans);
    }
}

/* Error messages different type of testing
 

┌─[sputnik1six@parrot]─[/media/sputnik1six/DA50A1C750A1AAA9/Users/xrosn/Desktop/Store Folder/DSA CODE]
└──╼ $java JavaTypePromotionExpression.java
JavaTypePromotionExpression.java:9: error: incompatible types: possible lossy conversion from double to int
        int ans = a + b + c + d;
                            ^
1 error
error: compilation failed
┌─[✗]─[sputnik1six@parrot]─[/media/sputnik1six/DA50A1C750A1AAA9/Users/xrosn/Desktop/Store Folder/DSA CODE]
└──╼ $java JavaTypePromotionExpression.java
JavaTypePromotionExpression.java:9: error: incompatible types: possible lossy conversion from double to int
        int ans = c + b + a + d;
                            ^
1 error
error: compilation failed
┌─[✗]─[sputnik1six@parrot]─[/media/sputnik1six/DA50A1C750A1AAA9/Users/xrosn/Desktop/Store Folder/DSA CODE]
└──╼ $java JavaTypePromotionExpression.java
JavaTypePromotionExpression.java:9: error: incompatible types: possible lossy conversion from float to int
        int ans = c + b + a ;
                        ^
1 error
error: compilation failed
┌─[✗]─[sputnik1six@parrot]─[/media/sputnik1six/DA50A1C750A1AAA9/Users/xrosn/Desktop/Store Folder/DSA CODE]
└──╼ $java JavaTypePromotionExpression.java
JavaTypePromotionExpression.java:9: error: incompatible types: possible lossy conversion from float to int
        int ans =   b + a + c;
                          ^
1 error
error: compilation failed
┌─[✗]─[sputnik1six@parrot]─[/media/sputnik1six/DA50A1C750A1AAA9/Users/xrosn/Desktop/Store Folder/DSA CODE]
└──╼ $java JavaTypePromotionExpression.java
JavaTypePromotionExpression.java:9: error: incompatible types: possible lossy conversion from double to int
        int ans = d + b + a + c;
                            ^
1 error
error: compilation failed
┌─[✗]─[sputnik1six@parrot]─[/media/sputnik1six/DA50A1C750A1AAA9/Users/xrosn/Desktop/Store Folder/DSA CODE]
└──╼ $java JavaTypePromotionExpression.java
JavaTypePromotionExpression.java:9: error: incompatible types: possible lossy conversion from double to long
        long ans = d + b + a + c;
                             ^
1 error
error: compilation failed
┌─[✗]─[sputnik1six@parrot]─[/media/sputnik1six/DA50A1C750A1AAA9/Users/xrosn/Desktop/Store Folder/DSA CODE]
└──╼ $java JavaTypePromotionExpression.java
35.0
┌─[sputnik1six@parrot]─[/media/sputnik1six/DA50A1C750A1AAA9/Users/xrosn/Desktop/Store Folder/DSA CODE]
└──╼ $




 */