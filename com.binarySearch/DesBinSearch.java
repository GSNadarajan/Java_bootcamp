
public class DesBinSearch {
    public static void main(String[] args) {
        int arr[] = {9,8,7,6,5,3,2,1};
        int target = 5;
        int result = des_bin_search(arr, target);
        System.out.println(result);
    }

    static int des_bin_search(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > arr[mid]){
                end = mid - 1;
            }
            else if(target < arr[mid]){
                start = mid + 1;
            }
            else{
                return mid;
            }


        }
        return -1;
    }
}
