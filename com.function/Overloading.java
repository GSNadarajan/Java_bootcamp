import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {

        // In this method overloading during compile
        // time java will know which function need to call based
        // on the parameter to be passed

        demo(1,2,3,4); // It will call the first function 
        demo("Nattu", "subash");  // It will call the second function
    }

    static void demo(int ...v){
        System.out.println("Integer function");
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
        System.out.println("String function");
        System.out.println(Arrays.toString(v));
    }
    
}
