import java.util.Scanner;

public class CalculatorSwitch {
    public static void main(String[] args) {

         Scanner scan=new Scanner(System.in);
         int a = scan.nextInt();
         int b= scan.nextInt();
         char op=scan.next().charAt(0);

         switch(op){
            case '+':
            System.out.println(a+b);
            break;

            case '-':
            System.out.println(a-b);
            break;

            case '*':
            System.out.println(a*b);
            break;

            case '/':
            System.out.println(a/b);
            break;

            default:
            System.out.println("Invalid Operator");
         }
          scan.close();
    }
}
