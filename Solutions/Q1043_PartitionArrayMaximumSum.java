package Q_1043_Partition_Array_Maximum_Sum;

public class PartitionArrayMaximumSum {
    public static void main(String[] args) {

        Solution1043 s = new Solution1043();
        int[] arr = { 1, 15, 7, 9, 2, 5, 10 };
        int k = 3;
        int result = s.maxSumAfterPartitioning(arr, k);
        System.out.println(result);
        
    }
    
}

class Solution1043 {
    int sum(int []arr,int i,int n)
    {
        int sum=Integer.MIN_VALUE;int j=i;
        for(;i<=n;i++)
        {
            sum=Math.max(sum,arr[i]);
        }
        return sum*(n-j+1);
    }
    public int maxSum(int[] arr, int k,int n,int[]t) {
        if(t[n]!=-1)
        return t[n];
    if(k>=n+1)
    {
        t[n]=sum(arr,0,n);
    return t[n];
    }

    int max=Integer.MIN_VALUE;
    int ans=Integer.MIN_VALUE;
    for(int i=0;i<k;i++)
    {
        if(n<k)
        break;
        max=Math.max(max,arr[n-i]);
        ans=Math.max(ans,(i+1)*max+maxSum(arr,k,n-i-1,t));
        t[n]=ans;

    }
    return ans;

   
    }
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int[]t=new int[arr.length];
        for(int i=0;i<t.length;i++)
        {
           
            t[i]=-1;

        }

        int max=maxSum(arr,k,arr.length-1,t);
       
        return max;
    }
}