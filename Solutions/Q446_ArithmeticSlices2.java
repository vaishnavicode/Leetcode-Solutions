package Solutions;

import java.util.*;

public class Q446_ArithmeticSlices2 {
    public static void main(String[] args) {

        Solution446 s = new Solution446();
        int[] nums = {0,2000000000,-294967296};
        System.out.println(s.numberOfArithmeticSlices(nums));
        
    }
    
}

class Solution446{

    public int numberOfArithmeticSlices(int[] nums) {

        int n = nums.length;

        int[][] arr = new int[n][n];

        HashMap<Long, ArrayList<Integer>> map = new HashMap<>();

        for(int i = 0; i < n; i++){

            long temp = nums[i];

            if(!map.containsKey(temp)){
                map.put(temp, new ArrayList<Integer>());
            }

            map.get(temp).add(i);
        }

        int result = 0;

        for(int i = 1; i < n; i++){

            for(int j = i + 1; j < n; j++){

                long a = 2L * nums[i] - nums[j]; //prevent overflow

                if(map.containsKey(a) ){

                    for(int k : map.get(a)){

                        if(k < i){
                            arr[i][j] += arr[k][i] + 1;
                        }else{
                            break;
                        }
                        
                    }

                }
                result += arr[i][j];
            }
        }
        return result;
    }
}
