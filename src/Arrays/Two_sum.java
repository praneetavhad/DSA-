package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_sum {

    public static void display(int []a){

        Missingnos.display(a);
    }


    public static void main(String[] args) {

        int [] a ={2,7,11,15};
        display(a);

        int target = 9;

//        HASHMAP
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<a.length;i++){
            int remain = target - a[i];
            if(map.containsKey(remain)){
                System.out.println(i + " "+ map.get(remain));
                break;
            }
            map.put(a[i],i);
        }
        System.out.println(map);

//        TWO POINTER for sorted array
        int n = a.length;
        int left = 0,right = n-1;
        Arrays.sort(a);
        while(left < right){
            int sum = a[left] + a[right];

            if(sum == target){
                System.out.println(left + " " + right);
                break;
            }
            if(sum > target){
                right--;
            }
            if(sum < target){
                left++;
            }
        }



    }
}
