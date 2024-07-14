public class MergeSort {


    public static void printArray(int array [] ) {
        
        for (int i = 0; i < array.length; i++) {
            
            System.out.print(array[i] + " ");
        }
    }

    public static void margeSort(int array[], int si, int ei) {
        
        if (si >= ei) {
            
            return;
        }
        int mid = si + (ei - si) / 2;

        margeSort(array, si, mid); // Deals with left part of array
        margeSort(array, mid + 1, ei); // Deals with right part of array
        marge(array, si, mid, ei);
    }

    public static void marge(int array[], int si, int mid, int ei) {

        int temp [] = new int[ei - si + 1];
        int i = si;  // Iterator for left part
        int j = mid + 1; // Iterator for right part 
        int k = 0; // Iterator for temp array

        while (i <= mid && j <= ei) {
            
            if (array[i] < array[j]) {
                
                temp[k] = array[i];
                i++;
            
            }else{

                temp[k] = array[j];
                j++;

            }
            
            k++;
        }

        // Remaining left part  
        while (i <= mid) {
            
            temp[k++] = array[i++];

        }

        // Remaining right part
        while (j <= ei) {
            
            temp[k++] = array[j++];

        }

        // Copy temporary array to orginal array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            
            array[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        
        int array[] = {6,3,9,100,-200,5,2,8,-2};
        margeSort(array, 0, array.length - 1);
        printArray(array);
    }
    
}