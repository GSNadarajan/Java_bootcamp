public class Changevalue {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] result = change(arr);
        for(int i = 0; i< result.length; i++){
            System.out.print(result[i]);
            
        }


    }

    public static int[] change(int[] arr){
        arr[0] = 6;
        arr[4] =454;
        return arr;
    }

    
}
