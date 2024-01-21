public class Leetcode_35 {
    public static void main(String[] args) {
        //https://leetcode.com/problems/search-insert-position/

        
        int[] arr = {1,2,4,5,6};
        int target = 3;
        int result = Position_insert(arr, target);
        System.out.println(result);
        
    }

    static int Position_insert(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }

        }

        return start;
    }
}
