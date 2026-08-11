public class PrintDigits {
    public static void printDigits(int num) {
        while (num != 0) {
            int digit = num % 10;
            System.out.println(digit);
            // last digit remove
            num = num / 10;
        }
    }
    public static void main(String[] args) {
        int num = 53127;
        printDigits(num);
    }
}
