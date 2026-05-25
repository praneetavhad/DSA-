package Arrays;

public class SumInMatrix {
    public static void main(String[] args) {
        int[][] a = {
                {7, 2, 1},
                {6, 4, 2},
                {6, 5, 3},
                {3, 2, 1}
        };

        int row = a.length;
        int col = a[0].length;

        System.out.println(row + " " + col);

        for(int j=0;j<col;j++){
            for(int i=0;i<row;i++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


        int sum = 0;
        for(int j=0;j<col;j++){
            int max = 0;
            for(int i=0;i<row;i++){
                max = Math.max(max,a[i][j]);
            }
            System.out.println(max);
            sum = sum + max;
        }
        System.out.println(sum);
    }
}
