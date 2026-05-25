package Arrays;

public class Largest_element {
    public static void main(String[] args) {
        int[] a = {3, 3, 6, 1};

        int large = Integer.MIN_VALUE;

        for (int i = 0;  i < a.length; i++) {
            if(a[i] > large){
                large = a[i];
            }
        }

        System.out.println(large);
    }
}
