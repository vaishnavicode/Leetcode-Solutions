package Solutions;

import java.util.Arrays;

public class Q2966_ArraysWithMaxDifference{
    public static void main(String[] args) {

        Solution2966 s = new Solution2966();
        int[] nums = {1,3,4,8,7,9,3,5,1};
        int k = 2;
        int[][] result = s.divideArray(nums, k);

        for (int i = 0; i < result.length; ++i) {
            System.out.println(Arrays.toString(result[i]));
        }
        
    }
}

class Solution2966 {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] result = new int[0][0];
        
        for (int i = 0; i + 2 < nums.length; ++i) {

            if (i % 3 == 0) {

                if (nums[i + 2] - nums[i] <= k) {

                    int[] triplet = {nums[i], nums[i + 1], nums[i + 2]};
                    result = Arrays.copyOf(result, result.length + 1);
                    result[result.length - 1] = triplet;
                } 
                else {
                    return new int[0][0];
                }
            }
        }
        
        return result;
    }
}
