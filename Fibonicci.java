import java.util.Scanner;

public class Fibonicci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        int n1 = 0;
        int n2 = 1;
        int i = 2;
        System.out.print(n1+ " " + n2);
        while (i <= n ) {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            i++;       
        }
        in.close();
    
    }
}
