package Solutions;

import java.util.HashMap;

public class SubmatricesThatSumTarget {
    public static void main(String[] args) {
        
        Solution1074 s = new Solution1074();
        int[][] matrix = {{0,1,0},{1,1,1},{0,1,0}};
        System.out.println(s.numSubmatrixSumTarget(matrix, 0));

    }
    
}

class Solution1074 {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        if (matrix == null) return 0;
        int m = matrix.length;
        int n = m > 0 ? matrix[0].length : 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) 
                matrix[i][j] += matrix[i][j - 1];
        
        }

        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                
                map.clear();
                int sum = 0;
                
                for (int k = 0; k < m; k++) {
                    sum += matrix[k][j] - ((i != 0) ? matrix[k][i - 1] : 0);
                    if (sum == target) 
                        count++;
                    
                    count += map.getOrDefault(sum - target, 0);
                    
                    map.merge(sum, 1, (a, b) -> a + b);
                }
            }
        }

        
        return count;
    }
}
