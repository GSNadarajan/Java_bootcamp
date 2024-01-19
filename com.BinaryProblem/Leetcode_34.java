import java.util.Arrays;

public class Leetcode_34 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6};
        int target = 4;
        
        int[] result = two_end_points(arr, target);
        
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    static int[] two_end_points(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int firstOccurrence = -1;
        int lastOccurrence = -1;

        // Find the first occurrence
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                firstOccurrence = mid;
                end = mid - 1; // Move left to find the first occurrence
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        // Reset start and end for finding the last occurrence
        start = 0;
        end = arr.length - 1;

        // Find the last occurrence
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                lastOccurrence = mid;
                start = mid + 1; // Move right to find the last occurrence
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        if (firstOccurrence != -1 && lastOccurrence != -1) {
            return Arrays.copyOfRange(arr, firstOccurrence, lastOccurrence + 1);
        } else {
            return new int[]{-1}; // Return -1 if the target is not found
        }
    }
}
