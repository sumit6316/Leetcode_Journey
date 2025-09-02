import java.util.*;
public class TopKFrequentWords {
    public static void main(String[] args) {
        
    }
    // class Word{
    //     String word;
    //     int freq;
    //     public Word(String word,int freq){
    //         this.word = word;
    //         this.freq = freq;
    //     }
    // }
    public List<String> topKFrequent(String []words,int k){
        Map<String,Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        PriorityQueue<String> pq = new PriorityQueue<>((w1,w2)->map.get(w1).equals(w2)? w2.compareTo(w1):map.get(w1)-map.get(w2));
        for(String word : map.keySet()){
            pq.add(word);
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<String> res  = new ArrayList<>();
        while(!pq.isEmpty()){
            res.add(pq.poll());
        }
        Collections.reverse(res);
        return res;

    }

}
