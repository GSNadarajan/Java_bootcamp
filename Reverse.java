import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int num = in.nextInt();
        int ans = 0;
        while(num > 0){
            int rem = num % 10; // 12342  --> 2
            ans =  ans * 10 + rem; // 0
            num = num /10;
        }
        System.out.println("The reverse number is "+ ans);
        in.close();
    }
    
}
