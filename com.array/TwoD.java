import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];

        for(int i = 0; i < arr.length; i++){  // Taking an input 
            // Iterate till the last row
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = in.nextInt();

            }
        }

        for(int i = 0; i < arr.length; i++){    // Here just printing it
            // Iterate till the last row 
            for(int j = 0; j < arr[i].length; j++){
                System.out.print("["+ arr[i][j] + "]");
            }
            System.out.println();
        }
        in.close();
    }
    
}
