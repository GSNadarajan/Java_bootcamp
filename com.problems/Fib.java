import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 ...
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the integer: ");
        int n = in.nextInt();
        int n1 = 0;
        int n2 = 1;
        int i = 2;
        System.out.print(n1 + " " + n2);
        while(i <= n){
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            i++;
        }
       
    
    }
}