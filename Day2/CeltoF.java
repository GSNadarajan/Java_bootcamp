
import java.util.Scanner;

public class CeltoF {
    public static void main(String[] args){
        System.out.print("Enter the celcius:");
        Scanner input = new Scanner(System.in);
        float celcius = input.nextFloat();
        float Fahrenhiet = celcius * 9/5 + 32;
        System.out.println("The Fahrenhiet value is" +Fahrenhiet);

    }
    
}
