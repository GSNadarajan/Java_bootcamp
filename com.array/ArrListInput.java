import java.util.ArrayList;
import java.util.Scanner;

public class ArrListInput {
    public static void main(String[] args) {
         
        //Declaring the ArrayList

        Scanner in = new Scanner(System.in);
        System.out.println("Enter five integers: ");

        ArrayList<Integer> arrList = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            arrList.add(in.nextInt());
        }

        System.out.println(arrList);
        in.close();

    
    }
    
}
