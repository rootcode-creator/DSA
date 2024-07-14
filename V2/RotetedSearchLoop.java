public class RotetedSearchLoop {
    
    public static int search(int arr[], int target, int si, int ei) {
        

        int value = 0;

        // Find mid
        int mid = si + (ei - si) / 2;


        // Search in mid
        if (arr[mid] == target) {
            return mid;
        }

        // Target on line 1
        if (arr[si] <= arr[mid]) {
            
            // Search: left
            if (arr[si] <= target && target <= arr [mid] ) {
                
                for (int i = si; i <= mid - 1; i++) {
                    
                    if (arr[i] == target) {
                        value = i ;
                    }
                }
               
            }
            
            // Search: Right
            else{


                for (int i = mid + 1; i <= ei; i++) {
                    
                    if (arr[i] == target) {
                        value = i ;
                    }
                }
                
            }
        }

        // Target on line 2
        else{

              // Search: Right
            if (arr[mid] <= target && target <= arr[ei] ) {
                

                for (int i = mid + 1; i <= ei; i++) {
                    
                    if (arr[i] == target) {
                        value = i ;
                    }
                }
                
            }
            
            // Search: Left
            else{

                
                for (int i = si; i <= mid - 1; i++) {
                    
                    if (arr[i] == target) {
                        value = i ;
                    }
                }

                
            }

        }


        return value;

    }


    public static void main(String[] args) {
        
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 7;

        int tarIndex = search(arr, target, 0, arr.length - 1);

        System.out.println("Number " + target + " has been found on index " + tarIndex);
    }

}
