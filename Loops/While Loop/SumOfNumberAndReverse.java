import java.util.Scanner;

public class SumOfNumberAndReverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int reverse = 0;
        int temp = Math.abs(number); 

        while (temp != 0) {
            int lastDigit = temp % 10; 
            reverse = reverse * 10 + lastDigit; 
            temp /= 10;                        
        }

        if (number < 0) {
            reverse = -reverse;
        }

        int sum = number + reverse;

        System.out.println("Original number: " + number);
        System.out.println("Reversed number: " + reverse);
        System.out.println("Sum of number and reverse: " + sum);
    }
}
