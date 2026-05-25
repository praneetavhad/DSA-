package Queue;

import java.util.PriorityQueue;

public class K_Largest_element {
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,6,4};
        int k=2;
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(Integer a : arr){
            if(q.size() == k){
                if(a > q.peek()){
                    q.remove();
                    q.add(a);
                }
            }else{
                q.add(a);
            }
        }

        System.out.println(q.peek());
    }
}
