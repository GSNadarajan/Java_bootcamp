import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.next();
       

        //Switch statement syntax

        switch(name){
            case "nattu":
                System.out.print("Your name is Nattu");
                break;
            case "subash":
                System.out.print("Your name is subash");
                break;
            case "praveen":
                System.out.print("Your name is praveen");
                break;
            default:
                System.out.print("May I know your good name ?");
        }
        in.close();

    }
    
}
