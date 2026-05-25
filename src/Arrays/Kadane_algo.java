package Arrays;

import static Arrays.Missingnos.display;

public class Kadane_algo {
    public static void main(String[] args) {

        int a[] ={-2,-1,-3,4,-1,2,1,-5,4};
        display(a);

        int n = a.length;

//        BRUTE
//        int maxsum=0;
//        for(int i=0;i<n;i++){
//            for(int j=i;j<n;j++){
//                int sum=0;
//                for(int k=i; k<j;k++){
//                    sum = sum + a[k];
//                    maxsum = Math.max(maxsum,sum);
//                }
//            }
//        }

//        BETTER
//        int maxsum=0;
//        for(int i=0;i<n;i++) {
//            int sum = 0;
//            for (int j = i; j < n; j++) {
//                sum = sum + a[j];
//                maxsum = Math.max(maxsum, sum);
//            }
//        }


//        OPTIMAL (KADANE)
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + a[i];
            maxsum = Math.max(maxsum,sum);

            if(sum<0){
                sum = 0;
            }
        }
        System.out.println(maxsum);


//        KADANE PRINT ARRAY
//        int maxsum = Integer.MIN_VALUE;
//        int sum = 0;
//        int start = 0,end=0;
//        for(int i=0;i<n;i++){
//            if(sum ==0){
//                start = i;
//                end = i;
//            }
//            sum = sum + a[i];
//            if(sum > maxsum){
//                maxsum = sum;
//                end = i;
//            }
//            maxsum = Math.max(maxsum,sum);
//            end = i;
//
//            if(sum<0){
//                sum = 0;
//            }
//        }
//        System.out.println(maxsum);
//        System.out.println(start + " " + end);
    }
}
