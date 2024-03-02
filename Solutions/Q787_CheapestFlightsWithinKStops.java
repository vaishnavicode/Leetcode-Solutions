package Solutions;

import java.util.Arrays;

public class Q787_CheapestFlightsWithinKStops {
    public static void main(String[] args) {

        Solution787 s = new Solution787();
        int[][] flights = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        System.out.println(s.findCheapestPrice(4, flights, 0, 3, 1));
    }
    
}

class Solution787 {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
         int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[src] = 0;
        for (int i = 0; i <= k; i++) {
            if (isRoutePossible(distance, flights)) {
                break;
            }
        }
        return distance[dst] == Integer.MAX_VALUE ? -1 : distance[dst];
    }
    private boolean isRoutePossible(int[] dist, int[][] flights) {
        int[] copy = Arrays.copyOf(dist, dist.length);
        boolean result = true;

        for (int[] flight : flights) {
            int src = flight[0];
            int dst = flight[1];
            int  cost =flight[2];

            if (copy[src] < Integer.MAX_VALUE && dist[dst] > dist[src] + cost) {
                dist[dst] = cost + copy[src];
                result = false;
            }
        }
        return result;
    }
}
