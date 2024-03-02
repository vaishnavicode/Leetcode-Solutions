package Solutions;

public class Q2971_PolygonWithLargestPerimeter {
    public static void main(String[] args) {

        Solution2971 s = new Solution2971();
        int[] nums = {1,12,1,2,5,50,3};
        System.out.println(s.largestPerimeter(nums));
        
    }
    
}

class Solution2971 {
    public long largestPerimeter(int[] nums) {
    
    return f1(nums , nums.length);
        
    }
        
        long f1(int[] nums , int end)
        {
        int maxIndex = 0;
        long sum = 0 ;
        for(int i=0 ; i< end ;i++)
        {
            sum += nums[i];
                
            if( nums[i]> nums[maxIndex])
                maxIndex= i;
        }
        if((sum-nums[maxIndex])> nums[maxIndex])
            return sum ;
        else
        {   
             int temp = nums[maxIndex];
             nums[maxIndex]=nums[end-1];
             nums[end-1]=temp;
             if(end < 3)
                 return -1;
             return f1(nums, end-1);
        }
   
      }
}
