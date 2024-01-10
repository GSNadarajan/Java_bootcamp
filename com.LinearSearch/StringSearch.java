public class StringSearch  {
    public static void main(String[] args) {
        
        // Searching a character in the string
        // example "nattu" -> char 'a' is found in the string or not

        String name = "nattu";
        char target = 'j';
        System.out.println(String_searching(name, target));

    }

    static boolean String_searching(String str, char target){

        if(str.length() == 0){
            return false;
        }

        for(int i = 0; i < str.length(); i++){
            if(target ==  str.charAt(i)){
                return true;
            }

        }

        return false;
    }

    
}
