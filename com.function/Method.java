import java.util.Scanner;

public class Method{
    public static void main(String[] args) {
        int sum = sum();
        System.out.println("The sum is  "+ sum) ;

    }

    public static int sum(){
        // Q: take input of 2 numbers and print the sum

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = in.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        in.close();
        return sum;

    }
}