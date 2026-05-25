package Arrays;

public class Max_cons_1 {
    public static void main(String[] args) {
        int a[] ={1,0,1,1,0,1};
        int n=a.length;
        int cnt = 0;
        int total_1 = 0;

        for(int i=0;i<n;i++){
            if(a[i]==1){
                cnt++;
                total_1 = Math.max(cnt,total_1);
            }else{
                cnt =0;
            }
        }

        System.out.println(total_1);
    }
}
