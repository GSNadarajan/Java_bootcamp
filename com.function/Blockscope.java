public class Blockscope{
    public static void main(String[] args) {
        
        int a = 10;
        String name = "Nattu";
        System.out.println(name);
        System.out.println("First time" + a);


        {  // This is block scope 
            a = 23;
            System.out.println("Second time" + a);
            int b = 1;
            System.out.println(b);
        }
        int b = 2;
        System.out.println("last value of b" +b);

        System.out.println("Third time" + a);
    }

  
 
}