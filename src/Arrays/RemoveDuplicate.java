package Arrays;

import java.security.KeyStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int [] a = {4,3,2,7,8,2,3,1};

        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<a.length;i++){
                map.put(a[i], map.getOrDefault(a[i],0) +1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            if(value > 1){
                ans.add(key);
            }
        }
//
//        System.out.println(map);
//        System.out.println(ans);

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<a.length;i++){
            if(!set.contains(a[i])){
                set.add(a[i]);
            }else{
                ans.add(a[i]);
            }
        }

        System.out.println(set);
        System.out.println(ans);
    }
}
