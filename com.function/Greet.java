
import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        String result = greeting();
        System.out.println(result);
        
    }

    static String greeting(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
        String result = "Hello " + name + " !";
        in.close();
        return result;
    }
    
}
