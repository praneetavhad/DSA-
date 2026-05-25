package Arrays;

public class leftRotateby1 {

    public static void display(int []a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[]={1, 2, 3, 4, 5};
        int n= a.length;
        int first = a[0];

        display(a);

        for(int i=0;i<n-1;i++){
            a[i] = a[i+1];
        }

        a[n-1] = first;
        display(a);
    }
}
