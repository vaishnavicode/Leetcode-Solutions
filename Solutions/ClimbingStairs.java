package Solutions;

public class ClimbingStairs {
    public static void main(String[] args) {

        Solution70 s = new Solution70();
        System.out.println(s.climbStairs(3));
        

    }

    
}

class Solution70 {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
        
    }
}