package Solutions;

import java.util.ArrayList;
import java.util.List;

public class Q1291_SequentialDigits {
    public static void main(String[] args) {
        
        Solution s = new Solution();
        List<Integer> result = s.sequentialDigits(100, 300);
        System.out.println(result);
        
    }
    
}

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> a = new ArrayList<>();

        for (int i = 1; i <= 9; ++i) {
            int num = i;
            int nextDigit = i + 1;

            while (num <= high && nextDigit <= 9) {
                num = num * 10 + nextDigit;
                if (low <= num && num <= high) {
                    a.add(num);
                }
                ++nextDigit;
            }
        }

        a.sort(null);
        return a;
    }
}
