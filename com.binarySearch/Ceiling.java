public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 5;
        // To find the nearest element to the target which is greater than or equal to the target
        int result = ceil(arr, target);
        System.out.println(result); 
    }

    static int ceil(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        int result = -1; // Initialize result to an invalid value

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target <= arr[mid]) {
                result = mid; // Update result and continue search in the left subarray
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }
}
