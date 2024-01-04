
import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.next();
        String message = greeting(name);
        System.out.println(message);
        in.close();      
    }

    // Creating a method and passing an argument while calling the method with return type

    static String greeting(String name){ 
        String result = "Hello " + name + " !";
        return result;
    }
    
}
