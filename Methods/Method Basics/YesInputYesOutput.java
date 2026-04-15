class Calculator
{
    int res;

    int add(int x, int y)   // Method with return type
    {
        res = x + y;
        return res;   // returns the result
    }
}

public class YesInputYesOutput
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        int a = 10;
        int b = 20;
        int sum = calc.add(a, b);
        System.out.println(sum);
    }
}
