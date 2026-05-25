package Arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNos {


    public static void main(String[] args) {
        int a[] = {1,1,2,3,3,4,4};
        int n=a.length;

//        //Brute
//        for(int i=0;i<n;i++){
//            int cnt=0;
//            for(int j=0;j<n;j++){
//                if(a[j] == a[i]){
//                    cnt++;
//                }
//            }
//            if(cnt == 1){
//                System.out.println(a[i]);
//                break;
//            }
//        }

//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<n;i++){
//            map.put(a[i], map.getOrDefault(a[i],0) + 1);
//        }
//
//        System.out.println(map);
//
////        System.out.println(map.get());
//
//        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
//            if(entry.getValue() == 1){
//                System.out.println(entry.getKey());
//                break;
//            }
//        }

        int xor = 0;
        for(int i=0;i<n;i++){
            xor = xor ^ a[i];
        }
        System.out.println(xor);
    }
}
