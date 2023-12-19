import java.util.Scanner;

public class Demo {
    // Structure of java program 
    // Class name should be same as the file name with Caps
    // public is the access specifier for the functions 
    // static is the keyword which is used to access the main function in Demo class without creating object for it
    // main is the reserved keyword which is the entry level for this class Demo
    // String[] args is the command line argument for passing the array as input through terminal line
    // Sout is used to display the output 
    public static void main(String[] args){
        // System.out.println("Hello Nattu !");
        Scanner inp = new Scanner(System.in);
        String result = inp.nextLine();
        System.out.println(result);
        inp.close();

       
    }
    
}
