package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int a[] ={-1,0,1,2,-1,-4};
        int target = -1;

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(a);
        for (int i=0;i<a.length-3;i++){
            if(i > 0 && a[i] == a[i - 1]){
                continue;
            }

            for(int j=i+1;j<a.length-2;j++) {
                if (j > i + 1 && a[j] == a[j - 1]) {
                    continue;
                }

                int l = j + 1;
                int r = a.length - 1;


                while (l < r) {
                    long sum = (long) a[i] + a[j] +a[l] + a[r];

                    if (sum == target) {
                        ans.add(Arrays.asList(a[i], a[j], a[l], a[r]));

                        l++;
                        r--;
                        while (l < r && a[l] == a[l + 1]) {
                            l++;
                        }

                        while (l < r && a[r] == a[r - 1]) {
                            r--;
                        }

                    } else if (sum > target) {
                        r--;
                    } else {
                        l++;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
