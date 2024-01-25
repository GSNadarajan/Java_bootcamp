public class Leetcode_852 {
    public static void main(String[] args) {
        int[] arr = {0,10,5,2};
                 //  0 1 2  3
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start )/ 2;

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
