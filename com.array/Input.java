import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        
        int[] num = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 5 integers: ");

        for(int i = 0; i < num.length; i++){
            num[i] = in.nextInt();  // Taking 5 integer from the user
        }

        // for(int i = 0; i < num.length; i++){
        //     System.out.print(num[i] + " ");  // Printing the array elements using the same for loop
        // }

        for(int val : num){
            System.out.print(val + " ");  // Enhanced forloop 
        }

        in.close();
    }
    
}
