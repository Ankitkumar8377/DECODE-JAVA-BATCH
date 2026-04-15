// import java.util.Scanner;

// public class InputOfArrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int[] arr = new int[7];
        
//     //Input Loop
//         for(int i = 0;i<=6;i++){
//             arr[i] = sc.nextInt();
//         }
//     }
// }


//2.
import java.util.Scanner;

public class InputOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

    // Input loop
        for(int i = 0; i <= n - 1; i++) {
            arr[i] = sc.nextInt();
        }

    // Output loop
        for(int i = 0; i <= n - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}