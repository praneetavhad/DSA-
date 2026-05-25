package BinarySearch;


import Arrays.Missingnos;

import static Arrays.Missingnos.display;

public class BinarySearch {
    public static void main(String[] args) {
        int a[] = {-1,0,3,5,9,12};
        int target = 9;
        display(a);
        BinaryFunc(a,target);
    }



    private static void BinaryFunc(int[] a, int target) {
        int low = 0;
        int high = a.length -1;

        while(low<=high){
            int mid = low + (high-low) / 2;

            if(a[mid] == target ){
                System.out.println("Here is the target" +mid);
            }
            if(target > a[mid]){
                low = mid+1;
            }else {
                high = mid -1;
            }
        }
    }
}
