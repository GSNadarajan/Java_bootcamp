public class Max {
    public static void main(String[] args) {
        
        int[] arr = { 1,2,3,4,5};
        // To find the maximum element in the array

        int result = maximum(arr);
        System.out.println(result);


    }

    static int maximum(int[] arr){
        int max = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    
}
