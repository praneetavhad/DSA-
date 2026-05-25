package Arrays;

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int a[] ={1,3,4};
        boolean flag = false;
        for (int i = 0; i < a.length-2; i++) {
            if(a[i] < a[i+1]){
                flag = true;
            }else {
                flag = false;
                break;
            }
        }

        System.out.println(flag);
    }
}
