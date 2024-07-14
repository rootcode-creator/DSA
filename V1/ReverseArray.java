public class ReverseArray {

    public static void reverseArray(int number[]) {

        int first =0;
        int last = number.length - 1;

        while ( first < last ) {
            int temp = number[first];
            number[first] =  number[last];
            number[last] = temp;
            first++;
            last--;
        }

    }

    public static void main(String[] args) {

        int array[] = {1,2,3,4,5,6,7,8,9,10};
        reverseArray(array);

        for (int i = 0; i < array.length; i++) {
            
            System.out.print(array[i] + " ");
        }
    }
}
