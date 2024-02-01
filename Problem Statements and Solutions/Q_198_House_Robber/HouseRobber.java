package Q_198_House_Robber;

public class HouseRobber {
    public static void main(String[] args) {
        
        Solution198 s = new Solution198();
        int[] nums = {1,2,3,1};
        System.out.println(s.rob(nums));


    }
    
}

class Solution198{
    public int rob(int[] nums) {

        int rob = 0;
        int norob = 0;

        for (int i = 0; i < nums.length; i ++) {

            int newRob = norob + nums[i];
            int newNoRob = Math.max(norob, rob);

            rob = newRob;
            norob = newNoRob;
            
        }

        return Math.max(rob, norob);
    }

}
