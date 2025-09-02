import java.util.*;
public class TopKFrequentElements {
    public static void main(String[] args) {

    }
    class Number implements Comparable<Number>{
        int element;
        int freq;
        Number(int element ,int freq){
            this.element = element;
            this.freq = freq;
        }
        public int compareTo(Number that){
            return that.freq - this.freq;
        }
    }
    public int[] topKFrequent(int nums[],int k){
        
        Map<Integer,Integer> map = new HashMap<>();
        PriorityQueue <Number> pq = new PriorityQueue<>();

        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        for(int ele : map.keySet()){
            Number num = new Number(ele, map.get(ele));
            pq.add(num);
        }
        int res[] = new int[k];
        int idx = 0;
        while(idx<k){
            Number new_num = pq.poll();
            res[idx] = new_num.element;
            idx++;
        }
        return res;
    }
}
