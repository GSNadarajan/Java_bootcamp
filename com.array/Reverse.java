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
        int temp = 0;

        while(start < end){  // here start and end represent the indices of the array not array element
            for(int i = 0; i < arr.length; i++){
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
            start++;
            end--;

        }
        return arr;
    }
}
