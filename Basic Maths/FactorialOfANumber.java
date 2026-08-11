//1. Iterative Approach

// public class FactorialOfANumber {
//     public static void main(String[] args) {
//         int n = 5;
//         int fact = 1;
//         for (int i = 1; i <= n; i++) {
//             fact = fact * i;
//         }
//         System.out.println("Factorial = " + fact);
//     }
// }


//2. Recursive Approach

public class FactorialOfANumber {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;   // base case
        } else {
            return n * factorial(n - 1);  // recursive call
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int fact = factorial(n);
        System.out.println("Factorial = " + fact);
    }
}