//1.Parameterised

// import java.util.Scanner;

// public class Sum1ToN {
//     public static void sum(int n, int s){
//     if(n==0){
//         System.out.println(s);
//         return;
//     }
//     sum(n-1, s+n);
// }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n : ");
//         int n = sc.nextInt();
//         sum(n, 0);
// }
    
// }

//2. Return Type

import java.util.Scanner;

public class Sum1ToN {
    public static int sum(int n) {
        if (n == 1 || n == 0) return n; // base case
        return n + sum(n - 1); // call
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }

}
