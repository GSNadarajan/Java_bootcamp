public class Shadow {
    static int a = 12; // This 12 will be available for the entire shadow class block
    public static void main(String[] args) {
        System.out.println("printing first time : " + a);  // out 12
        int a = 10;  // 
        System.out.println("Inside main function" + a);  // out 10
        // Here a = 12 will be shadowed by the lower scope value of a is 10..

        int result = fun();
        System.out.println("Result from fun() : " + result);
                 
    }

    static int fun(){
        // System.out.println("Printing inside fun() :" + a);  // out 12
        return a;
    }

    
}
