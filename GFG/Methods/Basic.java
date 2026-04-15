import java.net.Socket;
import java.nio.channels.Pipe.SourceChannel;

public class Basic {
    public static void main(String[] args) {
        double x = Math.sqrt(16); //Square Root of any number
        System.out.println(x);
        System.out.println(Math.cbrt(27)); //Cube Root any number 
        System.out.println(Math.PI); //Value of pi
        System.out.println(Math.abs(-45)); //Convert negative to positive or Mod of number
        System.out.println(Math.floor(-1.99)); //Bottom Value
        System.out.println(Math.ceil(1.99)); //Top Value
        System.out.println(Math.max(8,100));
        System.out.println(Math.min(8, 100));
        System.out.println(Math.pow(3.2,9));
        System.out.println(Math.pow(-3.2,-3.2)); //NaN = Not a Number
    }
}
