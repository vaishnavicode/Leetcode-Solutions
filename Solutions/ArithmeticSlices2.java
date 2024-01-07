package Solutions;
import java.util.HashMap;
public class ArithmeticSlices2 {
    public static void main(String[] args) {

        Solution446 s = new Solution446();
        int[] nums = {0,2000000000,-294967296};
        System.out.println(s.numberOfArithmeticSlices(nums));
        
    }
    
}

class Solution446{
    public int numberOfArithmeticSlices(int[] nums) {

        HashMap<Integer,Integer>[] arr = new HashMap[nums.length];

        int result = 0;

        for(int i = 0; i < nums.length; i++){
            arr[i] = new HashMap<>();
        }
            

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < i; j++){

                long diff = (long)(nums[i] - nums[j]);

                if (diff > Integer.MAX_VALUE || diff < Integer.MIN_VALUE) {
                    continue; 
                }

                int diffInt = (int) diff;

                arr[i].put(diffInt, arr[i].getOrDefault(diffInt, 0) + 1);  
                if (arr[j].containsKey(diffInt)) {
                    arr[i].put(diffInt, arr[i].get(diffInt) + arr[j].get(diffInt));
                    result += arr[j].get(diffInt);
                }

                System.out.println(arr[i]);

            }
        }


        return result;
        
    }
}
