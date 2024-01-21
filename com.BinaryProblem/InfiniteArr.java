public class InfiniteArr {
    public static void main(String[] args) {
        int 
    }

    static int binary_search(int[] arr, int target , int start , int end){
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                // ans found which is middle element
                return mid;
            }
        }

        return -1;

    }
    
}
