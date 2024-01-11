package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Twosum {
    public static void main(String[] args) {
        
        // Input : [2,7,11,15]
        // output : [0,1]

        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twosum(nums, target);
        System.out.println(Arrays.toString(result));
      
    }

    static int[] twosum(int[] nums, int target){
        Map<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
    
}
