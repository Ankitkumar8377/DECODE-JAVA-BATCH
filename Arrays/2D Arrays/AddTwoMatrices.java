//With extra array

// public class AddTwoMatrices {
//     public static void main(String[] args) {
//         int[][] a = { { 1, 9, 2 }, { 3, 7, 4 }, { 8, 5, 6 } };
//         int[][] b = { { 9, 3, 7 }, { 8, 6, 5 }, { 2, 4, 1 } };

//         int m = a.length;
//         int n = b[0].length;

//         int[][] res = new int[m][n];

//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 res[i][j] = a[i][j] + b[i][j];
//             }
//         }

//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(res[i][j] + " ");
//             }
//             System.out.println();
//         }

//     }
// }


//Without extra array

public class AddTwoMatrices {
    public static void main(String[] args) {
        int[][] a = { { 1, 9, 2 }, { 3, 7, 4 }, { 8, 5, 6 } };
        int[][] b = { { 9, 3, 7 }, { 8, 6, 5 }, { 2, 4, 1 } };

        int m = a.length; //Length of rows
        int n = b[0].length; // Length of columns

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] += a[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }

    }
}