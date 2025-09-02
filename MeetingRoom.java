import java.util.*;
public class MeetingRoom {
    public static void main(String[] args) {
        int intervals[][] = {{7,10},{2,4}};
        System.out.println(check(intervals));
        
    }
    public static boolean check(int timings[][]){
        Arrays.sort(timings,(a,b)->a[0]-b[0]);
        for(int i=1;i<timings.length;i++){
            if(timings[i][0]<timings[i-1][1]){
                return false;
            }
        }
        return true;
    }
}
