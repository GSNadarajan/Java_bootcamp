package src;
import java.util.Scanner;

public class Demo1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = in.next();
        System.out.println("Hello " + name + " !");
        in.close();
    }
}