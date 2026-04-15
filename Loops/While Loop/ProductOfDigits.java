import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Please enter the number:");
        int n=Math.abs(sc.nextInt());

        int ld;

        if(n==0){
            System.out.println("Product is 0");
            return;
        }

        int pd=1;

        while (n!=0) {
            ld = n%10;
            pd = pd*ld;
            n/=10; 
        }
        System.out.println(pd);

    }
}
