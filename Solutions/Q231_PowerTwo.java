package Solutions;

public class Q231_PowerTwo {
    public static void main(String[] args) {
        
        Solution231 s = new Solution231();
        System.out.println(s.isPowerOfTwo(14));

    }   
}

class Solution231 {
    public boolean isPowerOfTwo(int n) {
       if(n<=0) return false;
        return ((n&(n-1))==0); 
    }
}
