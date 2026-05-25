package Arrays;

public class MoveZerosToEnd {

    public static void display(int []a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a[] ={0,1,0,3,12};

        display(a);
        int n=a.length;
        int j=-1;

        for(int i=0;i<n;i++){
            if(a[i]==0){
                j=i;
                break;
            }
        }

        if(j==-1){
            display(a);
        }

        System.out.println(j);

        for(int i=j;i<n;i++){
            if(a[i]!=0){
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
                j++;
            }
        }

        display(a);

    }
}
