package Solutions;

public class SetMismatch {
    public static void main(String[] args) {
        
        Solution645 s = new Solution645();
        int[] nums = {1,2,2,4};
        int[] ans = s.findErrorNums(nums);
        
        System.out.print("[ ");
        for(int k : ans){
            System.out.print(k + " ");
        }
        System.out.println("]");

    }
    
}

class Solution645 {
    public int[] findErrorNums(int[] nums) {

        int[] arr = new int[nums.length+1];

        int d = 0, m = 0;

        for(int i : nums){
            arr[i] += 1;
        }

        for(int k = 1; k < arr.length; k++){

            if(arr[k] == 0){
                m = k;
            }
            
            if(arr[k] == 2){
                d = k;
            }
        }



        return new int[]{d, m};
        
    }
}
