public class Leetcode_744 {
    public static void main(String[] args) {

        char[] arr = { 'c', 'f', 'j'};
        char target = 'a';  // output: 'c'
        char result = nextGreatestLetter(arr, target);
        System.out.println(result);

    }

    static char nextGreatestLetter(char[] arr, char target){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        
        // If the target is not found, return the element at 'start' index
        return arr[start];
    }
}
