package Solutions;

public class Q201_BitwiseANDNumbersRange {
    public static void main(String[] args) {

        Solution201 s = new Solution201();
        System.out.println(s.rangeBitwiseAnd(5, 7));
        
    }
    
}

class Solution201 {
    public int rangeBitwiseAnd(int left, int right) {
        int cnt = 0;
        while (left != right) {
            left >>= 1;
            right >>= 1;
            cnt++;
        }
        return (left << cnt);
    }
}


