package Lyft.Arrays;

import static Arrays.MoveZerosToEnd.display;

public class ProductOfArrayItself {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};

        int[] prefix_sum_left = new int[a.length];
        prefix_sum_left[0] = 1;
        for(int i=1;i<a.length;i++){
            prefix_sum_left[i] = prefix_sum_left[i-1] * a[i-1];
        }

        display(a);
        display(prefix_sum_left);

        int[] prefix_sum_right = new int[a.length];
        prefix_sum_right[a.length-1] = 1;
        for(int i=a.length-2;i>=0;i--){
            prefix_sum_right[i] = prefix_sum_right[i+1] * a[i+1];
        }

        display(prefix_sum_right);

        int[] ans = new int[a.length];
        for(int i=0;i<a.length;i++){
            ans[i] = prefix_sum_left[i] * prefix_sum_right[i];
        }
        display(ans);
    }
}
