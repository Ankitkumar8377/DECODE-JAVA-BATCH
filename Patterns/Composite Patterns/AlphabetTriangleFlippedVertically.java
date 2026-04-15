import java.util.Scanner;

public class AlphabetTriangleFlippedVertically {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter n: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) { // rows
            for (int j = 1; j <= n - i; j++) { // spaces
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++) { // stars
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}