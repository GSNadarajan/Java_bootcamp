public class Leetcode_162 {
    public static void main(String[] args) {
        //https://leetcode.com/problems/find-peak-element/description/
        
        int[] arr = {1, 2, 3, 1 };
        // output : 2
        int result = peak_index(arr);
        System.out.println(result);


    }

    public static int peak_index(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }

        return start;
    }
    
}

