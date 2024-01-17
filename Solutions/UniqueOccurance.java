package Solutions;

import java.util.*;

public class UniqueOccurance {
    public static void main(String[] args) {
        
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        Solution1207 s = new Solution1207();
        System.out.println(s.uniqueOccurrences(arr));
    }
    
}

class Solution1207 {
    public boolean uniqueOccurrences(int[] arr) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i : arr){
            if(hm.containsKey(i)){
                hm.put(i, hm.get(i)+1);
            }
            else{
                hm.put(i, 1);
            }
        }

        for(int k : hm.keySet()){
            for(int j : hm.keySet()){
                if((j != k) && (hm.get(j) == hm.get(k))){
                    return false;
                }
            }
        }

        return true;
        
    }

    /*
        Alt: 
            public boolean uniqueOccurrences(int[] arr) {
            
                Map<Integer, Integer> m = new HashMap<>();

                for (int i : arr) {
                    m.put(i, m.getOrDefault(i, 0) + 1);
                }

                Set<Integer> occurrence = new HashSet<>(m.values());
                

                return occurrence.size() == m.size();
            
            }
     */
}

