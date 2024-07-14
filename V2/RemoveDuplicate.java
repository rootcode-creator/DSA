public class RemoveDuplicate {
    
    public static void duplicateRemover(String str, int index, StringBuilder newString, boolean map[]) {
        
        if (index == str.length()) {
            
            System.out.println("Unique string is: " + newString);
            return;
        }
        
        char currentChar = str.charAt(index);

        if (map[currentChar - 'a'] ) {
            
            duplicateRemover(str, index + 1, newString, map);

        }else{

            map[currentChar - 'a'] = true;
            duplicateRemover(str, index + 1, newString.append(currentChar), map);
        }
    }
    public static void main(String[] args) {
        
        String str = "apnnnacollegee";
        duplicateRemover(str, 0,new StringBuilder(""),new boolean[26]);
    }
}
