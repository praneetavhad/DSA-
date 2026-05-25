package Arrays;

import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String str[] = {"eat","tea","tan","ate","nat","bat"};

        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : str){
            char c[] = s.toCharArray();
            Arrays.sort(c);
            String ans = new String(c);
            if(!map.containsKey(ans)){
                map.put(ans,new ArrayList<>());
            }
            map.get(ans).add(s);

        }

        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            System.out.println(entry.getValue());
        }


//        StringBuilder sb
    }
}
