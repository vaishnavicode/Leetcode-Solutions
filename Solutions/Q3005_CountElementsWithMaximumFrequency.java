package Solutions;

public class Q3005_CountElementsWithMaximumFrequency {
    public static void main(String[] args) {

        Solution3005 s = new Solution3005();
        int[] nums = {1,2,2,3,1,4};
        System.out.println(s.maxFrequencyElements(nums));
        
    }
    
}

class Solution3005 {
    public int maxFrequencyElements(int[] nums) {

        int maxNum = Integer.MIN_VALUE;

        for(int num:nums){
            if(num>maxNum) maxNum = num;
        }

        int arr[] = new int[maxNum+1];
        
        for(int num2:nums){
            arr[num2]++;
        }

        int maxFrequency = 0;

        for (int freq : arr) {
            if (freq > maxFrequency) {
                maxFrequency = freq;
            }
        }

        int countMaxFrequency = 0;

        for (int freq : arr) {
            if (freq == maxFrequency) {
                countMaxFrequency++;
            }
        }

        return maxFrequency*countMaxFrequency;
    }
}
