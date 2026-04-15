import java.util.Scanner;

public class AbsoluteNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;         //variable declaration
        System.out.println("Enter the number: ");
        number= sc.nextInt();
        if(number < 0)      //condition checking
        {
        System.out.println(-number);
        }
        else
        {
        System.out.println(number);
        }
        
    }
}
