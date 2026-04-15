//1. Without using Extra Parameter

// import java.util.Scanner;

// public class PrintIncreasing {
//     static int n;
//     public static void print(int x){
//         if(x>n) return; // base case
//         System.out.println(x); // work
//         print(x+1); // call
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n : ");
//         n = sc.nextInt();
//         print(1);
// }
// }

//2. With using Extra Parameter

// import java.util.Scanner;

// public class PrintIncreasing {
//     public static void print(int x,int n) {
//         if (x > n) return; // base case
//         System.out.println(x); // work
//         print(x + 1,n); // call
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter n : ");
//         int n = sc.nextInt();
//         print(1,n);
//     }
// }


//3. After Recursive Call

import java.util.Scanner;

public class PrintIncreasing {
    public static void print(int n) {
        if (n == 0) return; // Base Case
        print(n - 1); // Call
        System.out.println(n); // Work
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        print(n);
    }
}




