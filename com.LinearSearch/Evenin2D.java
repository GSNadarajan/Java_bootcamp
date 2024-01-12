public class Evenin2D {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7 , -8};
        int result = even_digit_2d(arr);
        System.out.println(result);

    }

    static int even_digit_2d(int[] arr){
        if(arr.length == 0){
            return 0;
        }

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                count+= 1;
            }          
        }
        return count;
    }
    
}
