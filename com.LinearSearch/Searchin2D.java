public class Searchin2D {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {23, 34, 24, 56},
            {21, 56, 67, 99}
        };
        int target = 56;
        int[] result = search_in_2D(arr, target);
        System.out.println("The index position of "+ target + " is " + result);
        if(result == null){
            System.out.println(target + " is not found in the array");
        }
        System.out.print("[" + result[0] + "][" + result[1] + "]");
        
        
        
        
    }

    static int[] search_in_2D(int[][] arr, int target){
        if(arr.length == 0){
            return null;
        }
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }

        return null;
    }

       static int max_in_2D(int[][] arr){
        if(arr.length == 0){
            return 0;
        }

        int max= 0;
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }

        return max;
    }


    
}
