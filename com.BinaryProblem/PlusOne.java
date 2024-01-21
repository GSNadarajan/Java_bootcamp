import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int carry = 1;

        for (int i = n - 1; i >= 0; i--) {
            digits[i] += carry;
            carry = digits[i] / 10;
            digits[i] %= 10;
        }

        if (carry > 0) {
            List<Integer> result = new ArrayList<>();
            result.add(carry);
            for (int digit : digits) {
                result.add(digit);
            }

            // Convert List<Integer> to int[]
            int[] resultArray = new int[result.size()];
            for (int i = 0; i < result.size(); i++) {
                resultArray[i] = result.get(i);
            }

            return resultArray;
        } else {
            return digits;
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int[] digits1 = {1, 2, 3};
        int[] result1 = plusOne(digits1);
        printArray(result1); // Output: [1, 2, 4]

        int[] digits2 = {4, 3, 2, 1};
        int[] result2 = plusOne(digits2);
        printArray(result2); // Output: [4, 3, 2, 2]

        int[] digits3 = {9};
        int[] result3 = plusOne(digits3);
        printArray(result3); // Output: [1, 0]
    }

    // Helper method to print an array
    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
