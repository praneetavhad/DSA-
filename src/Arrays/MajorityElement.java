package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int a[] = {2,2,3,3,1,2,2};

        Missingnos.display(a);
        int n=a.length;
//        BRUTE
//
//        for(int i=0;i<n;i++){
//            int cnt =0 ;
//            for(int j=0;j<n;j++){
//                if(a[j] == a[i]){
//                    cnt++;
//                }
//
//                if(cnt > n/2){
//                    System.out.println(a[i]);
//                    return;
//                }
//            }
//        }


//        BETTER
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<n;i++){
//            map.put(a[i], map.getOrDefault(a[i],0)+1);
//        }
//
//        System.out.println(map);
//
//        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//            if(entry.getValue() > n/2){
//                System.out.println(entry.getKey());
//            }
//        }

//        BETTER (SORT)
//        Arrays.sort(a);
//        System.out.println(a[n/2]);

//        OPTIMAL
        int ele=-1;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                cnt++;
                ele = a[i];
            } else if (a[i] == ele) {
                cnt++;
            }else {
                cnt--;
            }
        }

        int final_cnt=0;
        for(int i=0;i<n;i++){
            if(a[i] == ele){
                final_cnt++;
            }
        }

        if(final_cnt > n/2){
            System.out.println(ele);
        }


    }
}
