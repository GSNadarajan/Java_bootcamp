public class Leetcode_162 {
    public static void main(String[] args) {
        //https://leetcode.com/problems/find-peak-element/description/
        
        int[] arr = {1, 2, 3, 1 };
        //First iteration
        //start = index(0) , end = index(3) (0+3/2 = 1) ==> here element 2 is in the first index (mid = 1) 
        // checking condition (2 > 3) {false} updating start to mid + 1 (start = 3)

        // Second iteration
        // start = index(2) , end = index(3) ==> mid = index(2) => value of mid is 3
        // checking condition (3 > 1) (here we confirm it starts decreasing, so we found a possible peak;
        // now, we need to explore the left side to find a higher element (potential peak))
        // updating end = mid


        //Third iteration (Here we found the decreasing element now we need to check whether another possible element is there ?)
        // start = index(2) , end  = index(2)

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

        return end;
    }
     
}

