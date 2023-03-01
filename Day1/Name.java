import java.util.Scanner;

// import java.util.Scanner;

public class Name{                     
    public static void main(String[] args){   //javac filename.java (for compilation) ->we get a byte code 
        //                                               //filename.java (for interpretation) ->get interpreted using JVM
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the input here:");
    //  int a = input.nextInt();
    //  System.out.println("The number is"+ " " +a);
     String name = input.next();
     System.out.println("Your name is "+name);
     
    }

}