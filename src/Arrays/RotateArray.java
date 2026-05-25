package Arrays;

public class RotateArray {

    public static void rotate(int[] arr, int start,int end){
        while(start < end){
            int temp= arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int a[] ={1,2,3,4,5,6,7};
        int k=3;
        int n=a.length;
        rotate(a,0,n-1);
        rotate(a,0,k-1);
        rotate(a,k,n-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }

    }
}
