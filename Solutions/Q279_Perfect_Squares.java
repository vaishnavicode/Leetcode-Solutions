class PerfectSquares{
    public static void main(String[] args) {
        
        Solution279 s = new Solution279();
        System.out.println(s.numSquares(13));

    }
}

class Solution279 {
    public int numSquares(int n) {
         int sqrt = (int) Math.sqrt(n);

        if (sqrt * sqrt == n)
            return 1;

        while (n % 4 == 0)
            n = n / 4;

        if (n % 8 == 7) return 4;

        for (int i = 1; i * i <= n; i++) {
            int square = i * i;
            int base = (int) Math.sqrt(n - square);

            if (base * base == n - square) return 2;
        }

        return 3;
    }
}