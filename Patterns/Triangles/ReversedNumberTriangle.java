//1.

// import java.util.Scanner;

// public class ReversedNumberTriangle {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter value of n: ");
//         int n = sc.nextInt();
        
//         for (int i = n; i >= 1; i--) {         
//             for (int j = 1; j <= i; j++) {  
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
        
//         sc.close();
//     }
// }


//2.

import java.util.Scanner;

public class ReversedNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();
        
        for (int i = n; i >= 1; i--) {         
            for (int j = 1; j <= i; j++) {  
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
