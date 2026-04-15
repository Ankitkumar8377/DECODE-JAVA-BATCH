//1. 

// import java.util.Scanner;

// public class NumberSpiral {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.printf("Enter n: ");
//         int n = sc.nextInt();

//         for (int i = 1; i <= 2 * n - 1; i++) { // rows
//             for (int j = 1; j <= 2 * n - 1; j++) { // spaces
//             int a = i, b = j;
//         if (i > n) a = 2 * n - i;
//         if (j > n) b = 2 * n - j;
//         System.out.print(Math.min(a, b) + " ");
//         }
//     System.out.println();
//     }
//     }
// }


//2.

import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n - 1; i++) { // rows
            for (int j = 1; j <= 2 * n - 1; j++) { // spaces
            int a = i, b = j;
        if (i > n) a = 2 * n - i;
        if (j > n) b = 2 * n - j;
        System.out.print(n+1-Math.min(a, b) + " ");
        }
    System.out.println();
    }
    sc.close();
    }
}
