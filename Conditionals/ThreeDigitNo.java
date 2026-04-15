import java.util.Scanner;

public class ThreeDigitNo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n=scan.nextInt();

        if(n>99 && n<100) {System.out.println("Three digit number");}
        else {System.out.println("Not A Three digit number");}

        scan.close();
    }
}
