import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        //String str = sc.next(); //When we write multiple words in it then only first word will be considered
        String str = sc.nextLine(); // It will consider complete string ankit kumar is a student
        System.out.print("Hi ");
        System.out.println(str);
    }
}
