public class Solution {
    // public static int length(String str) {
    // if(str.length() == 0) {
    // return 0;
    // }
    // return length(str.substring(1)) + 1;
    // }



    public static int length(String str , int count) {
        if(str.length() == count) {
        
            return count;
        }
        str.charAt(count);
        count++;

        return length(str, count);
        
    }
    public static void main(String[] args) {
    String str = "a";
    System.out.println(length(str, 0));
    }
    }