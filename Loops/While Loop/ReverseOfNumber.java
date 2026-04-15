import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter the number:");
        int n=Math.abs(sc.nextInt());

        int ld;

        if(n==0){
            System.out.println("Reverse is 0");
            return;
        }

        int r=0;

        while (n!=0) {
            ld = n%10;
            r = r * 10 + ld;
            n/=10;
        }
        System.out.println(r);

    }
}

