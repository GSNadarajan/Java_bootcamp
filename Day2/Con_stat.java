
import java.util.Scanner;

public class Con_stat {
    public static void main(String[] args){
        //if condition in java
        Scanner n = new Scanner(System.in);
        System.out.println("Enter your salary:");
        float salary = n.nextFloat();
        if(salary > 10000){
            System.out.println("You are eligible for bonus");
        }
        else{
            System.out.println("You are not eligible for bonus");
        }
    }
}
