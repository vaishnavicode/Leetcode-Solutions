package Q_907_Sum_Subarray_Minimums;

public class SumSubarrayMinimums {
    public static void main(String[] args) {
        
        Solution907 s = new Solution907();
        int[] arr = {11,81,94,43,3};
        System.out.println(s.sumSubarrayMins(arr));

    }
    
}

class Solution907 {
    public int sumSubarrayMins(int[] arr) {
        int[] stk = new int[arr.length+1];
        int idx=0;

        int[] dp = new int[arr.length];
        dp[0] = arr[0];

        long res=dp[0];
        for(int i=1; i<arr.length; i++){
            while(idx>=0 && arr[stk[idx]]>=arr[i]){
                idx--; //popping stack top
            }

            dp[i] = idx<0?arr[i]*(i+1):dp[stk[idx]]+(arr[i]*(i-stk[idx]));
            res += dp[i];
            stk[++idx] = i; //pushing into stack
        }

        return (int)(res%1_000_000_007);
    }
}
