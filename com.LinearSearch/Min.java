public class Min{
    public static void main(String[] args) {

        // Finding the minimum element in the array

        int[] arr = { 1,2,3,4,5,-1,-2};
        int result = minimum_in_array(arr);
        System.out.println("The minimum value is "+ result);
        
    }

    static int minimum_in_array(int[] arr){

        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;
        }
}