package Solutions;

import java.util.Arrays;

public class Q977_SquaresSortedArray {
    public static void main(String[] args) {

        Solution977 s = new Solution977();
        int[] nums = {-4,-1,0,3,10};
        int[] ans = s.sortedSquares(nums);
        for(int i: ans){
            System.out.println(i);
        }
        
    }
    
}

class Solution977 {
    public int[] sortedSquares(int[] nums) {

        int[] square = new int[nums.length];

        for(int i = 0; i < nums.length; i++){

            square[i] = (int)Math.pow((nums[i]),2);

        }

        Arrays.sort(square);

        return square;
        
    }
}
