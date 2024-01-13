public class BinSearch {
    public static void main(String[] args) {
        //Binary search

        // Sort the given array ( either ascending or descending order)
        // find the middle element to split the array into two half
        // if the target element is lesser than middle then make a search with first half else search with second half
        // return the index

        int[] arr = {1, 3, 6, 7, 8, 9, 12, 13, 14, 22};
        int target = 7;
        int result = binary_search(arr, target);
        System.out.println(result);
   
    }

    static int binary_search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
