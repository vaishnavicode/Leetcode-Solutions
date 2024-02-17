public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {

        Solution2149 s = new Solution2149();
        int[] nums = {3,1,-2,-5,2,-4};
        int[] ans = s.rearrangeArray(nums);
        for (int i : ans) {
            System.out.print(i+" ");
        }
    }
    
}

class Solution2149 {
    public int[] rearrangeArray(int[] nums) {
        int result[] = new int[nums.length];
        int p=0;
        int n=1;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                result[p]=nums[i];
                p+=2;
            }
            else{
                result[n]=nums[i];
                n+=2;
            }
        }
        return result;
    }
}
