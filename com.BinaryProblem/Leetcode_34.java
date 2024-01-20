import java.util.Arrays;

public class Leetcode_34 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6};
        int target = 4;
        
        int[] result = searchRange(arr, target);
        
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public int[] searchRange(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            // find the middle element
            // int mid = (start + end ) /2 
            
            int mid = start + (end - start) /2;

            if(target )
        }
    }


     
    }
