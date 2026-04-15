//We can convert any integer into string by adding a empty string into it

import java.util.Scanner;

public class ConvertIntoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        //String s = "" + n; //User-Defined Method for converting integer into text
        String s = Integer.toString(n); //Built-In Method for converting integer into text
        System.out.println(s);
        System.out.println(s.length());
    }
}
