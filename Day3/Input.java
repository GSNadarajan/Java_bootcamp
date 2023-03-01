package Day3;

import java.util.Scanner;

public class Input {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.print("Enter the three numbers:");
        int a = n.nextInt();
        int b = n.nextInt();
        int c = n.nextInt();

        // int max = a;

        // if(b > max){
        //     max = b;
        // }
        // if(c > max){
        //     max = c;
        // }
        // System.out.println(max + " is the largest number");
        // int max = Math.max(a, b);
        System.out.println(Math.max(Math.max(a, b),c));
        
    }
}
    // }
     
    // }
    
// }
