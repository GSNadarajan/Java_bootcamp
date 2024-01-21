public class Leetcode_34 {
    public static void main(String[] args) {
        //34. Find First and Last Position of Element in Sorted Array
        //Input: nums = [5,7,7,8,8,10], target = 8
        //Output: [3,4]

        //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/


         int[] arr = {5,7,7,8,8,10};
         int target = 7; //output [3,4]
         int[] result = search_range(arr, target);
         System.out.print("[" +result[0] + "," + result[1] + "]");
    }

    public static int[] search_range(int[] arr, int target){

        int[] ans = {-1,-1};

        int start = search(arr, target, true);
        int end = search(arr, target , false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    public static int search(int[] arr, int target , boolean firstStartIndex){

        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                ans = mid;
                if(firstStartIndex){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    
}

