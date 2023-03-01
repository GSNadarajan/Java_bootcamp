import java.util.Scanner;

public class Main{ 
    public static void main(String[] args){//Here it runs on jc line like string[] as an array which holds in args
      //During interpreting the bytecode we need to pass an argument which will be accept as array
      Scanner n= new Scanner(System.in);
       int salary = n.nextInt();
       if(salary > 10000){
        System.out.println("You are eligible for bonus");
       }
       else if(salary >5000 && salary <10000){
        System.out.println("You are applicable for bonus");
       }
       else{
        System.out.println("You are not eligible for bonus");
       }

    }                            
        
}