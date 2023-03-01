package Day3;

import java.util.Scanner;

public class Typecheck {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        char ch = n.next().trim().charAt(0);
        //  System.out.println(ch);

         if(ch >='a' && ch<= 'b'){
            System.out.println("First letter is lower case");
         }
         else{
            System.out.println("First letter is Upper case");
         }

    }
    
}
