import java.util.Scanner;

public class ProductOfEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int n = Math.abs(sc.nextInt());

        if (n == 0) {
            System.out.println("Product is 0");
            return;
        }

        int pd = 1;
        boolean hasEven = false;

        while (n != 0) {
            int ld = n % 10;
            if (ld % 2 == 0 && ld != 0) { // even but not zero
                pd *= ld;
                hasEven = true;
            }
            n /= 10;
        }

        if (hasEven==true) {
            System.out.println("Product of even digits: " + pd);
        } else {
            System.out.println("No even digits in the number.");
        }
    }
}
