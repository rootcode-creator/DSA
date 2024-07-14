public class FriendsPairing {
    
    
    public static int pairing(int people) {
        
        if (people == 1 || people == 2) {
            
            return people;
        }

        return pairing(people - 1 ) + (people - 1 ) * pairing(people - 2);
    }


    public static void main(String[] args) {
        
        int people = 4;
        System.out.println("Total ways for pairing is: " + pairing(people));
    }

    
}
