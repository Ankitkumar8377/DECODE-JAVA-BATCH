import java.util.Scanner;

public class FactorialsFirstN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        long fact = 1;
        
        for (int i = 1; i <= n; i++) {
            fact *= i;  // Multiply with current number
            System.out.println("Factorial of " + i + " is: " + fact);
        }
    }
}
