import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5};
        System.out.println("Before getting reversed: " + Arrays.toString(arr));
        int[] reverse_result = reverse(arr);
        System.out.println("After getting reversed: " + Arrays.toString(reverse_result));
        
    }

    static int[] reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        
        return arr;
    }
    
}
