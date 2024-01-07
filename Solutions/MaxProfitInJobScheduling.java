package Solutions;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

class maxProfitInJobSchedulint{
    public static void main(String[] args) {

        Solution1235 s = new Solution1235();
        int[] startTime = {1,2,3,4,6}, endTime = {3,5,10,6,9}, profit = {20,20,100,70,60};
        System.out.println(s.jobScheduling(startTime, endTime, profit));

    }
}


class Solution1235 {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] cal = new int[n][3];

        for (int i = 0; i < n; i++) {
            cal[i][0] = startTime[i];
            cal[i][1] = endTime[i];
            cal[i][2] = profit[i];
        }

        Arrays.sort(cal, Comparator.comparingInt(a -> a[1]));

        TreeMap<Integer, Integer> dp = new TreeMap<>();
        dp.put(0, 0);
        
        for(int[] job: cal){
            int start = job[0];
            int end = job[1];
            int currJobProfit = job[2];

            Integer prevJob = dp.floorKey(start);
            
            int maxProfit = dp.get(prevJob) + currJobProfit;
            int maxProfitSoFar = dp.lastEntry().getValue();

            if(maxProfit > maxProfitSoFar)
                dp.put(end, maxProfit);
        }

        return dp.lastEntry().getValue();
    }
}