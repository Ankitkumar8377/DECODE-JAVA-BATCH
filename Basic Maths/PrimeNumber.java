//1.

// public class PrimeNumber {
//     public static void main(String[] args) {
//         int n = 7;
//         boolean isPrime = true;
//         if (n <= 1) {
//             isPrime = false;
//         } else {
//             for (int i = 2; i < n; i++) {
//                 if (n % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }
//         if (isPrime) {
//             System.out.println("Prime");
//         } else {
//             System.out.println("Not Prime");
//         }
//     }
// }


//2.

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 7;
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}

