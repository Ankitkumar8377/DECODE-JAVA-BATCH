public class SubtractTwoMatrices {
    public static void main(String[] args) {
        int[][] a = { { 1, 9, 2 }, { 3, 7, 4 }, { 8, 5, 6 } };
        int[][] b = { { 9, 3, 7 }, { 8, 6, 5 }, { 2, 4, 1 } };

        int m = a.length; 
        int n = b[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = a[i][j] - b[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
