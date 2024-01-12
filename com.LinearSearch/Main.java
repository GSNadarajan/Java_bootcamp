public class Main {
    public static void main(String[] args) {
         
        // int[] arr = { 1,2,3,4,5};  // Declaration of an array
        // Linear Search is nothing searching an element in an array 

        int[] age = {21, 22, 23,24,25,26,27}; // array initialization 
        int target = 26; // To find whether 26 available in the array or not

        int result = linear_search(age, target);
        System.out.println("Result 1 : " +result);
        boolean result2 = linear_search2(age, target);
        System.out.println("Result 2 : " +result2);


    }

    static int linear_search(int[] arr, int target){  // It will return the index value of the searching element in the array
        if(arr.length == 0){
            return -1;
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return target;
            }
        }

        return -1;

    }   


    static boolean linear_search2(int[] arr, int target){

        if(arr.length == 0){
            return false;
        }

        for(int element : arr){
            if(target ==  element){
                System.out.println(element);
                return true;

            }
       
        }
         return false;
        
    }
}