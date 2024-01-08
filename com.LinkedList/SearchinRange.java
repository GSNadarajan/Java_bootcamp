public class SearchinRange {
    public static void main(String[] args) {
        
        // searching an element in an array within the range

        int[] r_no = { 1,2,3,4,5,6,7,8,9,10};
        int target = 14;
        int start = 1;
        int end = 4;

        System.out.println(Search_range(r_no, start, end, target));
        
    }

    static boolean Search_range(int[] arr, int start , int end, int target){

        if(arr.length  == 0){
            return false;
        }

        for(int i = start; i < end; i++){
            if(arr[i] == target){
                return true;
            }
        }

        return false;
    }
    
}
