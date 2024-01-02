import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String language = in.next();
       
        
        // Nested switch case
        
        switch(language){
            case "english":
                System.out.println("Hello micheal");
                break;
            case "tamil":
                System.out.println("Enter your name: ");
                String name = in.next();
                switch (name) {
                    case "nattu":
                        System.out.println("vanakkam nattu");                        
                        break;
                    case "subash":
                        System.out.println("vanakkam subash");
                        break;
                    default:
                        System.out.println("vanakkam thamilaa");
                        break;
                }
            // default:
            //     System.out.println("Nothing");
            //     break;
        }
        in.close();
    }
    
}
