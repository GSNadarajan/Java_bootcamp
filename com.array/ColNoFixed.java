import java.util.Scanner;

public class ColNoFixed {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[2][2];

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++ ){
                arr[row][col] = in.nextInt();
            }
        }

         for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++ ){
                System.out.print(arr[row][col] + " ");
            }
             System.out.println();
        }

        // for(int[] num: arr){
        //     System.out.println(num);
        // }
    }
    
}
