import java.util.Arrays;

public class PassinFunction {
    public static void main(String[] args) {
       
    // Arrays are mutable in java
    // For example

    int[] age = { 1,2,3,4};  // Here age is the reference variable pointing to an object { 1,2,3,4}
    int[] result = change(age);             // output : 11 2 3 4  (Original object is being changed)
    // System.out.println("Values from the change() function: " + result);
    System.out.println("After converting into string");
    System.out.println(Arrays.toString(change(age)));
    
    }

    static int[] change(int[] arr){  // This argument is also pointing to the same object { 1,2,3,4}
        arr[0] = 11;                // If value of arr is changed , then original object is also being changed
        return arr;
    }
    
}
