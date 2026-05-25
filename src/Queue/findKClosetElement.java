package Queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class findKClosetElement {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int k=4;
        int x=3;

        PriorityQueue<int[]> maxheap = new PriorityQueue<>((a, b) -> b[0] - a[0]);

        for(int i=0;i< arr.length;i++){

            if(maxheap.size() >= k){
                int diff = Math.abs(x -arr[i]);
                if(diff < maxheap.peek()[0]){
                    maxheap.remove();
                    int temp[] = new int[2];
                    temp[0] = diff;
                    temp[1] = arr[i];
                    maxheap.add(temp);
                }
                else if(diff == maxheap.peek()[0]){
                    if(arr[i] < maxheap.peek()[1]){
                        maxheap.remove();
                        int temp[] = new int[2];
                        temp[0] = diff;
                        temp[1] = arr[i];
                        maxheap.add(temp);
                    }
                }
            }else{
                int diff = Math.abs(x -arr[i]);
                int temp[] = new int[2];
                temp[0] = diff;
                temp[1] = arr[i];
                maxheap.add(temp);
            }

        }

//        while(!maxheap.isEmpty()){
//            System.out.println(Arrays.toString(maxheap.remove()) + " ");
//        }

        ArrayList<Integer> ans = new ArrayList<>();

        while(!maxheap.isEmpty()){
            int demo = maxheap.remove()[1];
            System.out.println(demo);
        }

        System.out.println(ans);


    }
}
