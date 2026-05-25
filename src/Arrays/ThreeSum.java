package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int a[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(a);
        for (int i=0;i<a.length-2;i++){
            int l = i+1;
            int r = a.length-1;
            if(i > 0 && a[i] == a[i - 1]){
                continue;
            }

            while(l < r){
                int sum = a[i] + a[l] + a[r];

                if(sum == 0){
                    ans.add(Arrays.asList(a[i],a[l],a[r]));
                    while(l < r && a[l] == a[l + 1]){
                        l++;
                    }

                    while(l < r && a[r] == a[r - 1]){
                        r--;
                    }

                    l++;
                    r--;
                }
                else if(sum > 0){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        System.out.println(ans);
    }
}
