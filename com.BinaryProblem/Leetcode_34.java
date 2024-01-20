public class Leetcode_34 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6};
        int target = 4;

        int[] result = searchRange(arr, target);
        
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static int[] searchRange(int[] arr, int target){

        int[] ans = {-1, -1};
        // Check for first occurence if target first
        int start = search(arr, target , true);
        int end = search(arr, target , false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }
    

    public static int search(int[] arr, int target, boolean firstStartIndex){

        int ans = -1;
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            // find the middle element
            // int mid = (start + end ) /2 
            
            int mid = start + (end - start) /2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if (target < arr[mid]){
                start = mid + 1;
            }
            else{
                ans = mid;
                if(firstStartIndex == true){
                    end = mid -1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return ans;
        
    }


     
    }
