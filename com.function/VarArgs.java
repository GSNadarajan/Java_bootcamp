import java.util.Arrays;

public class VarArgs {
    // In java Variable length arguments is simply we can pass n input 
    //of input data based on the datatype... But it should follow the 
    //order while taking the values from the parameter

    public static void main(String[] args) {
       varArgs(1,2,3,4);
        
    }

    static void varArgs(int a, int b,  int ...v){
        System.out.println("The value of a: " + a);
        System.out.println("The value of a: " + a);
        System.out.println(Arrays.toString(v));

    }

}
