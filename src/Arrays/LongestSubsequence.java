package Arrays;

import java.util.HashMap;

public class LongestSubsequence {
    public static void main(String[] args) {
        String s = "abcabcbb";
        String ans = "";
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            StringBuffer sb = new StringBuffer();
            sb.append(s.charAt(i));
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0) +1);

            
        }
    }
}
