package BinarySearch;

import static java.lang.Math.ceil;

public class KokoEatingBanana {
    public static void main(String[] args) {
        int a[] = {3,6,7,11};
        int h = 8;
        int n= a.length;




        //BRUTE
//        for(int i=1;i<a[a.length-1];i++){
//            int required_time = caluclate_time(a,i);
//            if(required_time <=h){
//                System.out.println("ANSWER " + i);
//                break;
//            }
//        }

        //OPTIMAL
        int low =1;
        int high = maximum_Array_element(a);
        int ans = Integer.MAX_VALUE;

        while(low<=high){
            int mid = (low + high) / 2;
            int required_time = caluclate_time(a,mid);

            if(required_time <= h){
                ans = mid;
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        System.out.println("Answer " + ans);
    }

    private static int maximum_Array_element(int[] a) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            max = Math.max(max,a[i]);
        }
        return max;
    }

    private static int caluclate_time(int[] a, int hourly) {
        int total_time =0;
        for(int i=0;i<a.length;i++){
            total_time = (int) (total_time + Math.ceil((double) a[i] /hourly));
        }
        return total_time;
    }
}
