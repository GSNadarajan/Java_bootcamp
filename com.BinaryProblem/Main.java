public class Main {
    public static void main(String[] args) {
        // When do we apply binary search ?
        // When an array is sorted then 95% we can apply sorted array

        // Qn: Ceiling of a number
        //int[] arr = {1,2,3,4,5,6,8}; // This array is in sorted, so we can use binary search
        // What is ceiling = smallest element in array greater than or = target
        
        // ceiling(arr, target= 6) = 6
        // ceiling(arr, target = 7) = 8

        int[] arr = { 11,12,14,15,17,19};
        int target = 13;
        
        int result = ceiling(arr, target);
        System.out.println(result);

    }

    static int ceiling(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target > arr[mid]){
                start = mid +1;
            }
            else if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                return arr[mid];
            }
            
        }

        return arr[start];
    }
}
