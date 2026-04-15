//1. 
import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.printf("Enter n : ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}


//2.
// import java.util.Scanner;

// public class AlphabetSquare {
//     public static void main(String[] args) {
        
//         Scanner sc= new Scanner(System.in);
//         System.out.printf("Enter n : ");
//         int n=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 System.out.print((char)(j+96) + " ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }

//3.
// import java.util.Scanner;

// public class AlphabetSquare {
//     public static void main(String[] args) {
        
//         Scanner sc= new Scanner(System.in);
//         System.out.printf("Enter n : ");
//         int n=sc.nextInt();
//         for (char ch = 'A'; ch < 'A' + n; ch++) {
//             for (int j = 0; j < n; j++) {
//                 System.out.print(ch + " ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }