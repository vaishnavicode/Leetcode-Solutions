package Q_300_Longest_Increasing_Seq;
class LongestIncreasingSeq{
    public static void main(String[] args) {

        Solution300 s = new Solution300();
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(s.lengthOfLIS(nums));
        
    }
}

class Solution300{

    public int lengthOfLIS(int[] nums) {

        int tails[] = new int[nums.length];
        int size = 0;

        for(int x : nums){
            int i = 0, j = size;

            while(j != i){
                int m = (i+j)/2;

                if(tails[m] < x){
                    i = m+1;
                }
                else{
                    j = m;
                }
            }

            tails[i] = x;

            if(i == size){
                size++;
            }

        }

        return size;
        
    }

}
