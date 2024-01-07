import java.util.ArrayList;
import java.util.Scanner;

public class ArrList {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        // Syntax of array list

        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(12);
        list.add(13);
        list.add(14);

        System.out.println("Printing the actual list: " + list);
        System.out.println("While updating:" + list.set(1, 45)); // updating the arrayList based on the index 

        System.out.println("While removing: " + list.remove(2));  // Here 2 is an index

        System.out.println("While checking: "+ list.contains(45)); // check whether the element 45 is avaialable or not

        System.out.println("After all operations : "+ list);
        in.close();
    
    }
    
}
