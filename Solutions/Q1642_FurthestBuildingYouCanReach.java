package Solutions;

import java.util.PriorityQueue;

public class Q1642_FurthestBuildingYouCanReach {

    public static void main(String[] args) {

        Solution1642 s = new Solution1642();
        int[] heights = {4,2,7,6,9,14,12};
        System.out.println(s.furthestBuilding(heights, 5, 1));
        
        
    }

}

class Solution1642 {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n = heights.length;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0;i<n-1;i++) {
            int diff = heights[i+1] - heights[i];
            if(diff > 0) {
                if(pq.size() < ladders) {
                    pq.add(diff);
                } else {
                    if(pq.isEmpty() || pq.peek() >= diff) {
                        bricks -= diff;
                    } else {
                        int poll = pq.poll();
                        pq.add(diff);
                        bricks -= poll;
                    }
                    if(bricks < 0) return i;
                }
            }
        }
        return n-1;
    }
}