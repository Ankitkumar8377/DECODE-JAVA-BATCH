import java.util.Scanner;

public class OutputUsingNestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];

        int m = arr.length; // Number of rows (outer array size)
        int n = arr[0].length; // Number of columns (inner array size)
        System.out.println(m);
        System.out.println(n);
        
    // Input of 2D Array
    for (int i = 0; i < 3; i++) { // rows
        for (int j = 0; j < 3; j++) { // cols
            arr[i][j] = sc.nextInt();
        }
    }

    // Output of 2D Array
    for (int i = 0; i < 3; i++) { // rows
        for (int j = 0; j < 3; j++) { // cols
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }  

    }
}
