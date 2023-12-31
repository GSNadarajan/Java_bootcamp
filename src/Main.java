package src;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = in.nextInt();
        if(age > 18){
            System.out.println("You are eligible for vote !");
        }
        else{
            System.out.println("You are not eligible for vote !");
        }
        in.close();
    }
}