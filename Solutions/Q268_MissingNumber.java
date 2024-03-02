package Solutions;

import java.util.Arrays;

public class Q268_MissingNumber {
    public static void main(String[] args) {
        
        Solution268 s = new Solution268();
        int[] nums = {9,6,4,2,3,5,7,0,1};
        System.out.println(s.missingNumber(nums));
        
    }
}

class Solution268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int[] v = new int[n+1];
        Arrays.fill(v, -1);
        for(int i = 0; i < nums.length; i++) {
            v[nums[i]] = nums[i];
        }
        for(int i = 0; i < v.length; i++) {
            if(v[i] == -1) return i;
        }
        return 0;
    }
}
