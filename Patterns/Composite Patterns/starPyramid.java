//1. Mathematical Method

// import java.util.Scanner;

// public class starPyramid {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n : ");
//         int n = sc.nextInt();

//         for (int i = 1; i <= n; i++) { // rows
//             for (int j = 1; j <= n - i; j++) { // spaces
//                 System.out.print(" " + " ");
//             }

//             for (int j = 1; j <= 2 * i - 1; j++) { // stars
//                 System.out.print("*" + " ");
//             }

//             System.out.println();
//         }
//         sc.close();
//     }
// }


//2. General Method

import java.util.Scanner;

public class starPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int nsp = n - 1;
        int nst = 1;

        for (int i = 1; i <= n; i++) { // rows
            for (int j = 1; j <= nsp; j++) { // spaces
                System.out.print(" " + " ");
            }

        for (int j = 1; j <= nst; j++) { // stars
            System.out.print("*" + " ");
        }
        System.out.println();
        nsp--;
        nst += 2;
    }
        sc.close();
    }
}
