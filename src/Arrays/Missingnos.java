package Arrays;

import java.util.Arrays;

public class Missingnos {
    public static void display(int []a){

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] ={0,1};
        int n=a.length;

//        Arrays.sort(a);
//        int i;
//        for(i=0;i<n;i++){
//            if(a[i]!=i){
//                System.out.println(i);
//                break;
//            }
//        }
//
//        System.out.println(i);

        int tot_sum = (n * (n+1))/2;
        int sum=0;
        for(int i=0;i<n;i++){
            sum = sum + a[i];
        }

        int missing_nos = tot_sum - sum;
        System.out.println(missing_nos);
    }
}
