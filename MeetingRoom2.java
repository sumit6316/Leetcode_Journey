import java.util.*;
public class MeetingRoom2 {
    public static void main(String[] args) {
        int intervals[][] = {{0, 30},{5, 10},{15, 20}}
        
    }

    
    public static int  countRooms(int intervals[][]){
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        pq.add(intervals[0]);
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][1]>=pq.peek()[1]){
                pq.poll();
            }
            pq.add(intervals[i]);
        }
        return pq.size();
    }
    
}
