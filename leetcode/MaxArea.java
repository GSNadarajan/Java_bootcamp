package leetcode;

public class MaxArea {
    public static void main(String[] args) {
        int[] height = { 1,8,6,2,5,4,8,3,7};
        int result = maxarea(height);
        System.out.println(result);
        
    }

    static int maxarea(int[] height){
        int left = 0;
        int right = height.length - 1;
        int maxarea = 0;

        while(left < right){
            int area = Math.min(height[left], height[right]) * (right - left);

            maxarea = Math.max(area, maxarea);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;

            }

        }
        return maxarea;

    }
}
