package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int a[] ={1,1,2};

        HashSet<Integer> set = new HashSet<>();
        // int cnt=0;
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }

        List<Integer> list = new ArrayList<>(set);
        System.out.println(list);
    }
}
