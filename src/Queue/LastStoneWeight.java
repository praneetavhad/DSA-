package Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {
    public static void main(String[] args) {
        int arr [] = {2,7,4,1,8,1};

//        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        for(Integer a : arr){
            maxHeap.add(a);
        }

        if(maxHeap.isEmpty()){
            System.out.println("0");
        }

        if(maxHeap.size() == 1){
            System.out.println(maxHeap.remove());
        }

        while(maxHeap.size() > 1){
            if(maxHeap.size() >= 2){
                int y = maxHeap.remove();
                int x = maxHeap.remove();
                int diff = y-x;
                if(diff !=0 ) {
                    maxHeap.add(diff);
                }
            }
        }


//        while(!minHeap.isEmpty()){
//            System.out.println(minHeap.remove() + " ");
//        }

        while(!maxHeap.isEmpty()){
            System.out.println(maxHeap.remove() + " ");
        }
    }
}
