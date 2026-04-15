//1.

import java.util.Scanner;

public class ReversedAlphabetTriangle {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter n : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}


//2.

// import java.util.Scanner;

// public class ReversedAlphabetTriangle {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter value of n: ");
//         int n = sc.nextInt();

//         char ch = 'A';
//         for (int i = n; i >= 1; i--) {       
//             for (int j = 1; j <= i; j++) {    
//                 System.out.print(ch + " ");
//             }
//             ch++;                      
//             System.out.println();
//         }

//         sc.close();
//     }
// }