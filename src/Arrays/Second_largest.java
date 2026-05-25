package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Second_largest {
    public static void main(String[] args) {
        int[] a = {8, 8,7, 6, 5};
//        Arrays.sort(a);
//        int largest = a[a.length-1];
//        int second_largest = 0;
//        for(int i=a.length-2; i>0;i--){
//            if(a[i] != largest){
//                second_largest = a[i];
//                break;
//            }
//        }
//
//        System.out.println(second_largest);

        int large = a[0];
        int second_largest = Integer.MIN_VALUE;

        for (int i = 0;  i < a.length; i++) {
            if(a[i] > large ){
                second_largest = large;
                large = a[i];
            } else if (a[i] < large && a[i] > second_largest) {
                second_largest = a[i];
            }
        }

        System.out.println(large);
        System.out.println(second_largest);
    }
}
