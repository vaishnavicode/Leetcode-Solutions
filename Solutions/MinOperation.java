package Solutions;

import java.util.Arrays;
public class MinOperation {
    public static void main(String[] args) {

        Solution2870 s = new Solution2870();
        int[] nums = {2,3,3,2,2,4,2,3,4};
        System.out.println(s.minOperations(nums));
        int[] nums2 = {14,12,14,14,12,14,14,12,12,12,12,14,14,12,14,14,14,12,12};
        System.out.println(s.minOperations(nums2));
    }
    
}


class Solution2870 {
    public int minOperations(int[] nums) {

        Arrays.sort(nums);

        int res = 0;
        int initial = 0;

        while(initial < nums.length){
            int temp = initial;
            
            while(temp < nums.length && nums[temp] == nums[initial]) {
                temp++;
            }

            int count = temp-initial;

            if(count == 1) return -1;

            res += count/3;

            if(count%3 != 0) res++;
            initial=temp;
        }
        return res;
       
    }
}
