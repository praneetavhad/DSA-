package Lyft.Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {
        int [] a ={-2,1,-3,4,-1,2,1,-5,4};

        int sum = 0;
        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
            max_sum = Math.max(sum, max_sum);

            if(sum < 0){
                sum = 0;
            }
        }

        System.out.println(max_sum);

    }
}
