public class CountNumberOfEvenDigits {
    public static void main(String[] args) {
        int n = 248531;
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                count++;
            }
            n = n / 10;
        }
        System.out.println("Even digits count = " + count);
    }
}
