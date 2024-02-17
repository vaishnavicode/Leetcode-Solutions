import java.util.Arrays;

public class LeastNumberUniqueIntegers {
    public static void main(String[] args) {

        Solution1481 s = new Solution1481();
        int arr[] = {4,3,1,1,3,3,2};
        System.out.println(s.findLeastNumOfUniqueInts(arr, 3));
        
    }
    
}

class Solution1481 {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Arrays.sort(arr);
        int[] node = new int[arr.length+1];
        int cnt = 0;
        int length=1;
        for (int i = 0; i < arr.length; i++) {
            if (i+1 < arr.length && arr[i] == arr[i+1]) {
                length++;
            } else {
                cnt++;
                node[length]++;
                length=1;
            }
        }
        for(int i=1;i<node.length;i++) {
            int canRemove = Math.min(k/i, node[i]);
            cnt-=canRemove;
            k-=canRemove*i;
        }
        return cnt;
    }
}
