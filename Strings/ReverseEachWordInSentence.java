//1. Reversing Complete Word


// import java.util.Scanner;
// public class ReverseEachWordInSentence {
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     StringBuilder sb = new StringBuilder(sc.nextLine());
//     reverse(sb, 2, 4);
//     //reverse(sb, 0, sb.length()-1); //Reversing complete String
//     System.out.println(sb);
// }

// public static void reverse(StringBuilder sb, int i, int j) {
//     while (i <= j) {
//         char temp = sb.charAt(i);
//         sb.setCharAt(i, sb.charAt(j));
//         sb.setCharAt(j, temp);
//         i++; j--;
//     }
// }
//     }


//2. Reversing multiple words containing spaces


import java.util.Scanner;

public class ReverseEachWordInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        int n = sb.length();
        int i = 0, j = 0;
        while (j < n) {
            if (sb.charAt(j) != ' ') {
                j++;
            } else {
                reverse(sb, i, j - 1);
                i = j + 1;
                j = i;
            }
        }
        reverse(sb, i, j - 1); // for last word reverse
        System.out.println(sb);
    }

    public static void reverse(StringBuilder sb, int i, int j) {
        while (i <= j) {
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++;
            j--;
        }
    }
}
