public class Prime {
    public static void main(String[] args) {
        boolean result = isPrime(3);
        System.out.println(result);      
    }

    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        int c = 2; // 0 1 is not a prime number
        while(c * c < num){
            if(num % c == 0){
                return false;
            }
            c++;  
               
        }
        if(c * c > num){
            return true;
        }
        return false;
    }
    
}
