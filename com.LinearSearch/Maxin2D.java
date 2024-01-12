public class Maxin2D {

    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {23, 34, 24, 56},
            {21, 56, 67, 99}
        };
        int result = max_in_2D(arr);
        System.out.println("The max element found in the array :"+ result);
             
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
