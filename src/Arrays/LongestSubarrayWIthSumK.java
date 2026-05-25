package Arrays;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LongestSubarrayWIthSumK {

    public static void display(int []a){

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] ={2,0,0,3};
        int k=3;


        display(a);
        int n=a.length;

////        brute force
//        int maxlen=0;
//        for(int i=0;i<n;i++){
//            int sum = 0;
//            for (int j=i;j<n;j++){
//                sum = sum + a[j];
//                if(sum == k){
//                    int len = j-i+1;
//                    maxlen = Math.max(len,maxlen);
//                    break;
//                }
//
//                if(sum > k){
//                    break;
//                }
//            }
//        }
//        System.out.println(maxlen);
//

        ////BETTER SOLN
//        int maxlen=0;
//
//        HashMap<Integer,Integer> map = new LinkedHashMap<>();
//        int sum=0;
//        for(int i=0;i<n;i++){
//            sum = sum + a[i];
//
//            if(!map.containsKey(sum)){
//                map.put(sum, i);
//            }
//
//            if(sum == k){
//                maxlen =  Math.max(maxlen,i+1);
//            }
//
//            int rem = sum -k;
//            if(map.containsKey(rem)){
//                int len = i - map.get(rem);
//                maxlen = Math.max(maxlen,len);
//            }
//        }
//
//        System.out.println(map);
//        System.out.println(maxlen);


        //OPTIMAL
        int left=0,right=0,maxlen=0;
        int sum = a[0];

        while(right < n){

            while(left <= right && sum > k){
                sum = sum - a[left];
                left++;
            }

            if(sum ==k){
                maxlen = Math.max(maxlen,right - left +1);
            }
            right++;
            if(right < n){
                sum = sum + a[right];
            }
        }

        System.out.println(maxlen);

    }
}
