public class RotetedSearch {
    

    public static int search(int arr[], int target, int si, int ei) {
        

        // Base Case
        if (si > ei) {
            return -1;
        }


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
                
                return search(arr, target, si, mid - 1);
            }
            
            // Search: Right
            else{

                return search(arr, target, mid + 1, ei);
            }
        }

        // Target on line 2
        else{

              // Search: Right
            if (arr[mid] <= target && target <= arr[ei] ) {
                
                return search(arr, target, mid + 1, ei);
            }
            
            // Search: Left
            else{

                return search(arr, target, si, mid - 1);
            }
        }



    }


    public static void main(String[] args) {
        
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        int tarIndex = search(arr, target, 0, arr.length - 1);

        System.out.println("Number " + target + " has been found on index " + tarIndex);
    }
}
