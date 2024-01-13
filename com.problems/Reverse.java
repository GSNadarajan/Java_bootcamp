import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the number : ");
       int num = in.nextInt();
       int ans = 0;
       while(num > 0){
            int rem = num % 10;
            ans = ans * 10 + rem;
            num = num / 10;
       }
       in.close();
       System.out.println(ans);
    }
    
}
