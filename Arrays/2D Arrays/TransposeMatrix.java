//1. Without changing actual array


// public class TransposeMatrix {
//     public static void main(String[] args) {
//         //1 2
//         //3 4
//         //5 6
//         int[][] arr = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
//         int m = arr.length, n = arr[0].length;

//         for (int j = 0; j < n; j++) {
//             for (int i = 0; i < m; i++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();

//         }
//     }
// }


//2. Storing in different array
// public class TransposeMatrix {
//     public static void main(String[] args) {
//         // 1 2
//         // 3 4
//         // 5 6
//         int[][] arr = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
//         int m = arr.length, n = arr[0].length;
//         int[][] ans = new int[n][m];

//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 ans[i][j] = arr[j][i];
//                 System.out.print(ans[i][j] + " ");
//             }
//             System.out.println();

            
//         }
//     }
// }


//3. Storing in same array( Write a program to change the given matrix with its transpose. )
public class TransposeMatrix {
    public static void print(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int m = arr.length;
        print(arr);

        // transposing
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        print(arr);

    }
}
