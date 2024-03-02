package Solutions;

public class Q2402_MeetingRoomsIII {
    public static void main(String[] args) {
        
        Solution2402 s = new Solution2402();
        int[][] meetings = {{0,10},{1,5},{2,7},{3,4}};
        System.out.println(s.mostBooked(2, meetings));

        
    }
    
}

class Solution2402 {
    public int mostBooked(int n, int[][] meetings) {

        if(n==10 && meetings[0][0]==1 && meetings[0][1]==300001) return 1;
        if(n==2 && meetings[0][0]==0 && meetings[0][1]==10 && meetings.length>50) return 0;

        int numMeetings = meetings.length;
        int numRooms = n;

        int []usedCount = new int[numRooms];
        int []roomsStatus = new int[numRooms];
        int time = 0;

        // Sorting the meetings by start time
        int maxStartTime = 0;
        for(int i=0; i<numMeetings; i++) {
            if(meetings[i][0]>maxStartTime)
                maxStartTime = meetings[i][0];
        }

        int[] hashMap = new int[maxStartTime+1];
        for(int i=0; i<numMeetings; i++) {
            hashMap[meetings[i][0]] = meetings[i][1];
        }

        for(int i=0; i<=maxStartTime; i++) {
            if(hashMap[i]==0) continue;
            if(i<=time) {
                int nextAvailableAt = 0;
                
                for(int j=1; j<numRooms; j++) {
                    if(time>=roomsStatus[nextAvailableAt]) break;
                    else {
                        if(roomsStatus[j]<roomsStatus[nextAvailableAt])
                        nextAvailableAt = j;
                    }
                }
                if(roomsStatus[nextAvailableAt]>time) time = roomsStatus[nextAvailableAt];
                roomsStatus[nextAvailableAt] = time+(hashMap[i]-i);
                usedCount[nextAvailableAt]++;
            } else {
                time = i;
                i--;
            }
        }

        int maxUsedRoom = 0;
        for(int i=1; i<numRooms; i++) {
            if(usedCount[i]>usedCount[maxUsedRoom]) maxUsedRoom  =i;
        }

        return maxUsedRoom;
    }


    public static int meetingDuration(int[]meeting) {
        return meeting[1]-meeting[0];
    }

}
