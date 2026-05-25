package Arrays;

public class SumOfarrayexpectItself {

    public static void display(int []a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] ={1,2,3,4};
        int n = a.length;
        int prefix[] = new int[n];
        int suffix[] = new int[n];
        int ans[] = new int[n];

        prefix[0]=1;
        suffix[n-1]=1;

        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] * a[i-1];
        }
        display(prefix);

        for(int i=n-2;i>=0 ;i--){
            suffix[i] = suffix[i+1] * a[i+1];
        }
        display(suffix);

        for(int i=0;i<n;i++){
            ans[i] = suffix[i] * prefix[i];
        }
        display(ans);

    }
}
