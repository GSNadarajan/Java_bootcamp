import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        System.out.println("Before getting swapped: " + Arrays.toString(arr));
        int[] result = swap(arr, 0, 1);
        System.out.println("After getting swapped: "+ Arrays.toString(result));
        
    }

    static int[] swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];  // swap these two varaiable
        arr[index2] = temp;
        return arr;
        
    }
    
}
