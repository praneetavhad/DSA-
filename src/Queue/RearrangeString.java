package Queue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RearrangeString {
    public static void main(String[] args) {
        String s = "abbb";
        char ch[] = s.toCharArray();

        HashMap<Character,Integer> map = new HashMap<>();
        for(Character c : ch){
            map.put(c, map.getOrDefault(c,0) + 1);
        }
        System.out.println(map);

        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a,b) -> b[1] - a[1]);
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            char c = entry.getKey();
            int cnt = entry.getValue();
            int temp[] = new int[2];
            temp[0] = c;
            temp[1] = cnt;
            maxHeap.add(temp);
        }

        int max_size = (s.length() + 1) / 2 ;
        if(max_size < maxHeap.peek()[1]){
            System.out.println("empty");
            return;
        }

        StringBuilder ans = new StringBuilder();
        while(maxHeap.size() > 1){
                int [] top = maxHeap.poll();
                int [] second_top = maxHeap.poll();

                ans.append((char) top[0]);
                ans.append((char) second_top[0]);

                top[1]--;
                second_top[1]--;

                if(top[1] > 0) {
                    maxHeap.add(top);
                }
                if(second_top[1] > 0){
                    maxHeap.add(second_top);
                }
        }

            if(!maxHeap.isEmpty()){
                int[] last = maxHeap.poll();
                if (last[1] > 1) {
                    System.out.println("Empty");
                    return;
                }
                ans.append((char) last[0]);
            }

        System.out.println(ans.toString());


//        while(!maxHeap.isEmpty()){
//            System.out.println(Arrays.toString(maxHeap.remove()) + " ");
//        }
    }
}
