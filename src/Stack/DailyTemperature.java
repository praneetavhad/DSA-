package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class DailyTemperature {
    public static void main(String[] args) {
        int a[] = {73,74,75,71,69,72,76,73};

//        ArrayList<Integer> ans = new ArrayList<>();
//
//        for (int i = 0; i < a.length; i++) {
//            int cnt_days = 0;
//            boolean found = false;
//            for (int j = i+1; j < a.length; j++) {
//                if(a[i] < a[j]){
//                    cnt_days = j-i;
//                    found = true;
//                    break;
//                }
//            }
//            if(!found){
//                cnt_days = 0;
//            }
//            ans.add(cnt_days);
//        }
//        System.out.println(ans);

        Stack<Integer> st = new Stack<>();
        int ans [] = new int[a.length];
        for(int i=0;i<a.length;i++){
            while(!st.isEmpty() && a[st.peek()] < a[i]){
                int idx = st.pop();
                ans[idx] = i - idx;
            }
            st.push(i);
        }

        System.out.println(Arrays.toString(ans));
    }
}
