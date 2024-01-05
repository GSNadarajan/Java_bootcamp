public class Amstrong {
    public static void main(String[] args) {
        int num = 153;
        int original = num;

        int result = 0;

        while(num > 0){  // checking till the last number
            int rem = num % 10;
            result = result + rem * rem * rem;
            num = num /10;
        }
        if(original == result){
            System.out.println(result + " is an amstrong number");
        }
        else{
            System.out.println(result + " is not an amstrong number");
        }
    }
    
}
