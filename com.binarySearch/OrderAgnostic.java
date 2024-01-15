public class OrderAgnostic {
    public static void main(String[] args) {
        // It will basically find the array which is in ascending order or descending order in the array 
        int[] arr = { 1,2,3,4,5,6};
        int target = 4;
        int result = order_agnosticBS(arr, target);
        System.out.println("Element present at " + result + " index");
        
    }

    static int order_agnosticBS(int[] arr, int target){
      
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc;

        if(arr[start] < arr[end]){
            System.out.println("Given array is in ascending order");
            isAsc = true;           
        }
        else{
            System.out.println("Given array is in descending order");
            isAsc = false;
        }


        while(start <= end){
            
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                // 1 2 3 4 5 6 (target:5)
                

                if(target > arr[mid]){
                    start = mid + 1;
                }
                else if(target < arr[mid]){
                    end = mid - 1;
                }
            }
            else{
                
                // 6 5 4 3 2 1 (target:2)
                if(target < arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }

        return -1;

          
    }
    
}
