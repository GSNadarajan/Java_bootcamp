public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
            {1,5},
            {7,3},
            {3,5}
        };
        int result = Max_wealth(arr);
        System.out.println(result);       
    }

    static int Max_wealth(int[][] accounts){
        int maxWealth = 0;
        for(int person = 0; person < accounts.length; person++){
            int currentWealth = 0;
            for(int account = 0; account < accounts[person].length; account++){
                currentWealth+= accounts[person][account];
            }

            maxWealth = Math.max(maxWealth, currentWealth);
        }
        return maxWealth;

    }
    
}
