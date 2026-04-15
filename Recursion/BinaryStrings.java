//1. Binary String in which consecutive '1's are not allowed.

// import java.util.Scanner;

// public class BinaryStrings {
//     public static void printStrings(String s, int n){
//         int m = s.length();
//         if(m == n){
//             System.out.println(s);
//             return;
//         }
//         if(m == 0 || s.charAt(m-1) == '0'){
//             printStrings(s + "1", n);
//             printStrings(s + "0", n);
//         } 
//         else {
//             printStrings(s + "0", n);
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         printStrings("", n);
//     }
// }

//2. All Possible Combination of Binary String

import java.util.Scanner;

public class BinaryStrings {
    public static void printStrings(String s, int n) {
        int m = s.length();
        if (m == n) {
            System.out.println(s);
            return;
        }
            printStrings(s + "1", n);
            printStrings(s + "0", n);
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStrings("", n);
    }
}
