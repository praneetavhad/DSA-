package Arrays;

import java.util.HashSet;
import java.util.Map;

public class LongestConsecativeSeq {
    public static void main(String[] args) {
        int a[] = {100,4,200,1,3,2};

        HashSet<Integer> set = new HashSet<>();

        for(Integer arr : a){
            set.add(arr);
        }

        int longest = 0;
        for(Integer arr : set){
            if(!set.contains(arr-1)){
                int cnt = 1;
                while(set.contains(arr+cnt)){
                    cnt++;
                }
                longest = Math.max(cnt,longest);
            }
        }

        System.out.println(longest);
    }
}
