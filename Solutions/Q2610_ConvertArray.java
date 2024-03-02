package Q_2610_Convert_Array;
import java.util.*;

class ConvertArray{
    public static void main(String[] args) {

        Solution2610 s = new Solution2610();
        int[] nums = {1,3,4,1,2,3,1};
        System.out.println(s.findMatrix(nums));
                
        
    }
}

class Solution2610 {

    public List<List<Integer>> findMatrix(int[] nums) {

        int[] f = new int[nums.length + 1];

        ArrayList<List<Integer>> sol = new ArrayList<>();

        for (int c : nums) {

            if (f[c] >= sol.size()) {

                sol.add(new ArrayList<>());

            }
            
            sol.get(f[c]).add(c);

            f[c]++;
        }

        return sol;
    }
}