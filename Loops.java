import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        // int num = 10;

        // FOR LOOP

        // for(int i = 0; i <= num; i+= 2){
        //     System.out.println(i);
        // }
        System.out.print("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int i = 1;
        while (i <= num) {
            System.out.println(i);
            i += 3;     
        }
        in.close();

    }
    
}
