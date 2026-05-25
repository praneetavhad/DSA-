package Arrays;


import static Arrays.MoveZerosToEnd.display;

public class Sort012 {

    public static void swap(int start, int end, int[] arr){
        int temp= arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void main(String[] args) {

        int a[] = {0,2,2,0,2,2,1,2,0,0,0};
        int low = 0;
        int mid = 0;
        int high=a.length-1;

        display(a);
        while(mid <= high){
            if(a[mid] == 0){
                swap(low,mid,a);
                low++;
                mid++;
            }
            else if(a[mid] == 1){
                mid++;
            }
            else{
                swap(mid,high,a);
                high--;
            }
        }

        display(a);

    }
}
