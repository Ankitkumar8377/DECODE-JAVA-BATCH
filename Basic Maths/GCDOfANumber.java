//Using Euclidean Algorithm
//gcd(a,b) = gcd(b,a%b) until b becomes 0

//1. Recusive Approach 

// public class GCDOfANumber {
//     public static int gcd(int a, int b) {
//         if (b == 0) {
//             return a;   // base case
//         }
//         return gcd(b, a % b);  // recursive call
//     }

//     public static void main(String[] args) {
//         int a = 12, b = 18;
//         System.out.println("GCD = " + gcd(a, b));
//     }
// }


//2. Iterative Approach

public class GCDOfANumber {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD = " + a);
    }
}