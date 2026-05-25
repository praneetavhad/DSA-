package Arrays;

//import static Arrays.Missingnos.display;

public class BuySellStock {
    public static void main(String[] args) {
        int a[] ={7,1,5,3,6,4};
//        display(a);

        int n= a.length;
        int min = a[0];
        int maxprofit = 0;

        for(int i=0;i<n;i++){
            int profit =0;
            min = Math.min(min,a[i]);
            profit = a[i] - min;
            maxprofit = Math.max(maxprofit,profit);
        }
        System.out.println(maxprofit);
    }
}
