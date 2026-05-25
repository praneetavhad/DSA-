package Arrays;

import java.util.HashMap;

public class TwoSum2 {
    public static void main(String[] args) {
        int a[] = {2,7,11,15};
        int target = 9;

//        HashMap<Integer,Integer> map = new HashMap<>();
//
//        for(int i=0;i<a.length;i++){
//            int key = target - a[i];
//            if(map.containsKey(key)){
//                System.out.println(target + "=" + a[i] + " " + key);
//                System.out.println (map.get(key)+1 + " " + (i+1));
//            }else{
//                map.put(a[i],i);
//            }
//        }

        int l = 0;
        int r = a.length - 1;

        while(l<r){

            int sum = a[l] + a[r];
            if(sum == target){
                System.out.println(l +" " + r);
                break;
//                return new int[]{l+1,r+1};
            }

            if(sum > target){
                r--;
            }else{
                l++;
            }
        }
    }
}
