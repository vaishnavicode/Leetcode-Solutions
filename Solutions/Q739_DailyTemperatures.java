package Q_739_DailyTemperatures;

public class DailyTemperatures {
    public static void main(String[] args) {

        Solution739 solution739 = new Solution739();
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] res = solution739.dailyTemperatures(temperatures);
        for(int i : res){
            System.out.print(i + " ");
        }
        
    }
    
}

class Solution739 {

    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] res = new int[n];
        int hottest = 0;

        for(int i = n-1; i >=0; i--){

            int currTemp = temperatures[i];

            if (currTemp >= hottest) {
                hottest = currTemp;
                continue;
            }

            int j = i+1;

            while (temperatures[j] <= currTemp) {
                j+=res[j];
            }
            
            res[i] = j-i;
        }
        return res;
    }
}
