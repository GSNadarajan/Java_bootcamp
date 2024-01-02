import java.util.Scanner;

public class Enswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter your good name: ");
        String name =in.next();

        // switch(name){
        //     case "nattu" -> System.out.println("Your name is nattu");
        //     case "subash" -> System.out.println("Your name is nattu");
        //     default -> System.out.println("I dont know your good name !");


        // }
        switch(name){
            case "nattu":
                System.out.println("Hello nattu");
                break;
            case "subash":
                System.out.println("Hello subash");
                break;
            default:
                System.out.println("May I know your good name ?");
        }

    }
    
}
